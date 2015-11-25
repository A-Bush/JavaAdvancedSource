package ua.com.webcamp.JavaAdv.Lesson03.Ex_02SplitAndJoin;

/**
 * Created by Artem Vereschaka on 8/7/15.
 */
public class StringExample {

    public static String join(String[] strings, String glue){
        StringBuffer sb = new StringBuffer();

        for(int i=0; i < strings.length; i++) {
            sb.append(strings[i]);

            if(i < strings.length - 1) {
                sb.append(glue);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "It was a dark place. Alan is walking directly straight. He can not see something.";

        // split and trim
        String[] sentences = s1.split("\\.");
        for (String s : sentences){
            System.out.println(s.trim());
        }


        //join
        System.out.println();
        String joinedStr = join(sentences, "!!!");
        System.out.println(joinedStr);
    }
}
