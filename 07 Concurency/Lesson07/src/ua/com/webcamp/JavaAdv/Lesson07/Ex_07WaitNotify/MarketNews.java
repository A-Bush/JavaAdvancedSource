package ua.com.webcamp.JavaAdv.Lesson07.Ex_07WaitNotify;

import org.apache.log4j.Logger;

import java.time.LocalTime;

/**
 * Created by Artem Vereschaka on 8/24/15.
 * artem.andzen@gmail.com
 */
public class MarketNews extends Thread {
    /**
     * Logger
     */
    static Logger log = Logger.getLogger(MarketNews.class);

    /**
     * Instance of News to notify
     */
    private News news;

    public MarketNews(News news) {
        this.news = news;
    }


    @Override
    public void run() {
        log.info("Obtaining news...");
        try {
            Thread.sleep(2000);
            news.setNews("Latest news " + LocalTime.now());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (news) {
            news.notify();
        }

    }
}
