package ua.com.webcamp.JavaAdv.Lesson03.Ex_08FSM;

/**
 * Created by Artem Vereschaka on 8/10/15.
 */

/**
 * Represents a concrete finite state machine based on switches
 */
public class SwitchFSM extends FSM {
    /**
     * Current state of machine
     */
    States state;

    /**
     * Returns an FSM.Event object by character
     * @param c input character
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
        if (s == null || s.length() == 0)
            return false;

        state = States.START;

        for (int i = 0; i < s.length(); i++) {
            if (state == States.TRAP)
                break;

            Event event = getEvent(s.charAt(i));
            eventHandle(event);
        }

        return state == States.CLOSE_PAR;
    }

    /**
     * Handler for events based on switches.
     * This method will change current state based on input event
     * @param event Input event in form of FSM.Event
     */
    private void eventHandle(Event event)
    {
        switch (state) {
            case START:
                switch (event) {
                    case OPEN_PAR:
                        state = States.OPEN_PAR;
                        break;
                    default:
                        state = States.TRAP;
                        break;
                }
                break;
            case OPEN_PAR:
                switch (event) {
                    case SIGN:
                        state = States.SIGN;
                        break;
                    default:
                        state = States.TRAP;
                        break;
                }
                break;
            case SIGN:
                switch (event) {
                    case DIGIT:
                        state = States.DIGIT;
                        break;
                    case LETTER:
                        state = States.LETTER;
                        break;
                    case CLOSE_PAR:
                        state = States.CLOSE_PAR;
                        break;
                    default:
                        state = States.TRAP;
                        break;
                }
                break;
            case DIGIT:
                switch (event) {
                    case DIGIT:
                        // nothing
                        break;
                    case CLOSE_PAR:
                        state = States.CLOSE_PAR;
                        break;
                    default:
                        state = States.TRAP;
                        break;
                }
                break;
            case LETTER:
                switch (event) {
                    case LETTER:
                        // do nothing
                        break;
                    case CLOSE_PAR:
                        state = States.CLOSE_PAR;
                        break;
                    default:
                        state = States.TRAP;
                        break;
                }
                break;
            case CLOSE_PAR:
                state = States.TRAP;
                break;
            case TRAP:
                break;
        }
    }
}
