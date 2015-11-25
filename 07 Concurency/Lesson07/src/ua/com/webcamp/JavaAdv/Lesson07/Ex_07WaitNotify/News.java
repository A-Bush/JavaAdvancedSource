package ua.com.webcamp.JavaAdv.Lesson07.Ex_07WaitNotify;

/**
 * Created by Artem Vereschaka on 8/24/15.
 * artem.andzen@gmail.com
 */
public class News {
    /**
     * Represents news
     */
    private String news;

    /**
     * Setter for news
     * @param news news
     */
    public void setNews(String news) {
        this.news = news;
    }

    /**
     * Prints fresh news to screen. Fresh news will be updated from MarketNews
     */
    public void printFreshNews(){
        MarketNews fresher = new MarketNews(this);
        fresher.start();

        synchronized (this){
            try {
                wait(); // try with different values
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(news);
    }
}
