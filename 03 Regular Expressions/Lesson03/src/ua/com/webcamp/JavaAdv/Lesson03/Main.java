package ua.com.webcamp.JavaAdv.Lesson03;

import java.io.*;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static String savePage(final String URL) {
        String line = "", all = "";
        URL myUrl = null;
        BufferedReader in = null;
        try {
            myUrl = new URL(URL);
            in = new BufferedReader(new InputStreamReader(myUrl.openStream(), "UTF-8"));

            while ((line = in.readLine()) != null) {
                all += line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return all;
    }

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("<h3 class=\"title\">");
        final String URLpage = "http://m.habrahabr.ru/?mobile=yes";
        // mobile version of Habr
        String page = savePage(URLpage);


        try {
            if (page.length() == 0) {
                System.out.println("Can not load page.");
            }

            Matcher matcher = pattern.matcher(page);
            int counter = 0;
            while (matcher.find()) {
                int end = matcher.end();

                String title = page.substring(end, page.indexOf("</h3>", end));

                System.out.printf("%d. %s.\n", ++counter, title);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // NOTE: page can be downloaded with wrong encoding.
        // try few times to obtain result.

    }
}
