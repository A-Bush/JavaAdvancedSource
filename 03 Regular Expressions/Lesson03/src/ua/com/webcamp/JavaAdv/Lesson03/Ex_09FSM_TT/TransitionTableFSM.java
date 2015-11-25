package ua.com.webcamp.JavaAdv.Lesson03.Ex_09FSM_TT;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Artem Vereschaka on 8/10/15.
 */

/**
 * Concrete implementation of finite state machine
 */
public class TransitionTableFSM extends FSM {
    /**
     * Inner class that represents single transition between states an event that triggers it
     */
    class Transition
    {
        States startState;
        Event trigger;
        States endState;

        public Transition(States startState, Event trigger, States endState)
        {
            this.startState = startState;
            this.trigger = trigger;
            this.endState = endState;
        }
    }

    /**
     * Table of transitions
     */
    class TransitionTable implements Iterable<Transition>
    {
        /**
         * List of transitions
         */
        private ArrayList<Transition> table;

        public TransitionTable()
        {
            table = new ArrayList<>();
        }

        /**
         * Adds new Transition to table by start/end states and trigger
         * @param start Start state
         * @param trigger Event that triggers it
         * @param end End state
         */
        public void add(States start, Event trigger, States end)
        {
            table.add(new Transition(start, trigger, end));
        }

        @Override
        public Iterator<Transition> iterator()
        {
            return table.iterator();
        }
    }


    /**
     * Table that represents all transitions
     */
    private TransitionTable transitionTable = new TransitionTable()
    {
        {
            add(States.START, Event.OPEN_PAR, States.OPEN_PAR);
            add(States.OPEN_PAR, Event.SIGN, States.SIGN);
            add(States.SIGN, Event.DIGIT, States.DIGIT);
            add(States.SIGN, Event.LETTER, States.LETTER);
            add(States.DIGIT, Event.DIGIT, States.DIGIT);
            add(States.DIGIT, Event.CLOSE_PAR, States.CLOSE_PAR);
            add(States.LETTER, Event.LETTER, States.LETTER);
            add(States.LETTER, Event.CLOSE_PAR,States.CLOSE_PAR);
        }
    };

    /**
     * Returns FSM.Event by character
     * @param c character
     * @return FSM.Event
     */
    public Event getEvent(char c)
    {
        if (isClosePar(c))
            return Event.CLOSE_PAR;
        if (isDigit(c))
            return Event.DIGIT;
        if (isOpenPar(c))
            return Event.OPEN_PAR;
        if (isLetter(c))
            return Event.LETTER;
        if (isSign(c))
            return Event.SIGN;

        return Event.ERROR;
    }

    @Override
    public boolean isMatch(String s)
    {
        States current = States.START;
        for (int i = 0; i<s.length();i++) {
            Event event = getEvent(s.charAt(i));

            if (event == Event.ERROR)
                return false;
            boolean notTrap = false;

            // then searching for transition that satisfies conditions
            for (Transition t : transitionTable) {

                // current state must coincide with start state and event - with trigger on tranition
                if (current == t.startState && event == t.trigger) {
                    notTrap = true; // flags that we find transition
                    current = t.endState; // move state
                    break;
                }
            }
            if (!notTrap)
                return false;
        }
        return current == States.CLOSE_PAR;
    }
}
