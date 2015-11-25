package ua.com.webcamp.JavaAdv.Lesson03.Ex_08FSM;

/**
 * Created by Artem Vereschaka on 8/7/15.
 */

/**
 * Abstract class that represents finite state machine
 */
public abstract class FSM {

    /**
     * Possible states of automaton
     */
    enum States
    {
        START, OPEN_PAR, CLOSE_PAR, SIGN, DIGIT, LETTER, TRAP
    }

    /**
     * Possible events
     */
    enum Event
    {
        OPEN_PAR, CLOSE_PAR, SIGN, DIGIT, LETTER, ERROR
    }

    /**
     * Checks whether a character is digit
     * @param c character
     * @return true if character is digit, false - otherwise
     */
    protected boolean isDigit(char c)
    {
        return (c >= '0' && c <= '9');
    }

    /**
     * Checks whether a character is open bracket
     * @param c character
     * @return true if character is open bracket, false - otherwise
     */
    protected boolean isOpenPar(char c)
    {
        return c == '<';
    }

    /**
     * Checks whether a character is close bracket
     * @param c character
     * @return true if character is close bracket, false - otherwise
     */
    protected boolean isClosePar(char c)
    {
        return c == '>';
    }


    /**
     * Checks whether a character is sign (plus or minus)
     * @param c character
     * @return true if character is sign, false - otherwise
     */
    protected boolean isSign(char c)
    {
        return (c == '+' || c == '-');
    }

    /**
     * Checks whether a character is letter
     * @param c character
     * @return true if character is letter, false - otherwise
     */
    protected boolean isLetter(char c)
    {
        return (c >= 'P' && c <= 'Z');
    }

    /**
     * Checks the string for matching
     * @param s
     * @return
     */
    public abstract boolean isMatch(String s);
}
