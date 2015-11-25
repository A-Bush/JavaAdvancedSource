package ua.com.webcamp.JavaAdv.Lesson03.Ex_07HabraParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Artem Vereschaka on 8/10/15.
 */
public class HabraParser {

    public static String savePage(final String PAGE_URL) {
        String line = "", all = "";
        URL myUrl = null;
        BufferedReader in = null;
        try {
            myUrl = new URL(PAGE_URL);
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
        final String pageURL = "http://m.habrahabr.ru/?mobile=yes";
        // mobile version of Habr
        String page = savePage(pageURL);


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
