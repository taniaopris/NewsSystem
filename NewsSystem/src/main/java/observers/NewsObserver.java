package observers;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import events.StopUpdateEvent;
import products.News;


public class NewsObserver implements Runnable {
    protected EventBus newsEventBus;
    protected News news;
    private static final int STOP_TIME_IN_MILLIS = 1000;
    private int counter = 0;

    public NewsObserver(EventBus eventBus, News news) {
        this.news = news;
        newsEventBus = eventBus;
    }

    public synchronized void build() {
    }

    @Subscribe
    protected void stopWhenStopEventOccurs(StopUpdateEvent stopEvent) {
        counter++;
        if(5 == counter){
            try {
                System.out.println("Ending: " + this.getClass());
                Thread.currentThread().join(STOP_TIME_IN_MILLIS);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        this.build();
    }

    public News getNews() { return this.news;}
}
