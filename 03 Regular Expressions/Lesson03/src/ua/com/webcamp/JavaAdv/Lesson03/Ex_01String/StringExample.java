package ua.com.webcamp.JavaAdv.Lesson03.Ex_01String;


/**
 * Created by Artem Vereschaka on 8/7/15.
 */

public class StringExample {

    public static boolean isString(Object obj){
        return obj instanceof String;
    }

    public static void main(String[] args) {

        System.out.println("-------------Creating of string-------------------");
        String str = "Hello";
        String appended = " dear students.";

        System.out.println(str + appended);
        // it is not efficient
        // when you write + (concatenation) JVM will create a new String object
        // it is better to use StringBuilder, or older thread-safe version, StringBuffer

        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" dear students.");

        System.out.println(sb.toString());
        // or in this way (append returns a reference to this StringBuilder object)
        StringBuilder sb1 = new StringBuilder()
                .append("Hello ")
                .append("dear ")
                .append("students.");
        System.out.println();

        //comparing strings
        System.out.println("-------------Comparing of strings-----------------");
        String s1 = "One";
        String s2 = new String("One");
        // without constructor JVM will optimize it
        // and "One" will be one object in a memory, but two references.
        // it will not always so

        System.out.println("  ==   : " + (s2 == s1));
        System.out.println("equals : " + s1.equals(s2));

        System.out.println();

        //instanceof
        System.out.println("-------------Instanceof---------------------------");
        Object s3 = 25.5f; // change it to string
        System.out.println("isString : " + isString(s3));

        System.out.println();

        //selecting parts
        System.out.println("-------------Selecting parts of string------------");
        String s4 = "Stay hungry, stay foolish.(c) Steven Paul Jobs";

        String author = s4.substring(30);
        String quote = s4.substring(0,26);
        System.out.println("Quote : " + quote);
        System.out.println("Author : " + author);

    }
}
