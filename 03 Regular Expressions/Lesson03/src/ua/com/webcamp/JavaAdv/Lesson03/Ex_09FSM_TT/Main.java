package ua.com.webcamp.JavaAdv.Lesson03.Ex_09FSM_TT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Artem Vereschaka on 8/10/15.
 */
public class Main {
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    /**
     * Reads all lines from file to array of strings
     * @param path filepath
     * @return Array of strings. String[]
     */
    public static String[] reader(String path)
    {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();

            String[] lines = everything.split(System.lineSeparator());

            return lines;
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
    }

    /**
     * Compares standard tools of Java and our Finite State Machine
     */
    public static void compareFirstToSecond()
    {
        String[] s = reader("file.txt");

        Pattern pattern = Pattern.compile("^<(\\+|-)(([0-5])*|([P-Z])*)>$");
        Matcher matcher;

        for (String some : s) {

            matcher = pattern.matcher(some);
            boolean isMatch1 = matcher.matches();

            FSM machine = new SwitchFSM();
            boolean isMatch = machine.isMatch(some);

            System.out.println(isMatch == isMatch1);
        }
    }

    /**
     * Solve the problem using Finite State Machine based on Transition Table
     */
    public static void transitionTableFSM()
    {
        String[] s = reader("file.txt");
        FSM machine = new TransitionTableFSM();

        for (String some : s) {
            boolean isMatch = machine.isMatch(some);
            String color;
            if (isMatch)
                color = ANSI_GREEN;
            else
                color = ANSI_RED;
            String result = String.format("%15s :: %s%5s%s", some, color, isMatch, ANSI_RESET);
            System.out.println(result);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Comparing of standard and SwitchFSM");
        compareFirstToSecond();

        System.out.println("\n----------------------------------\n");
        System.out.println("Transition Table FSM");
        transitionTableFSM();
    }
}
