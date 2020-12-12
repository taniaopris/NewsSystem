package observers;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import events.StopUpdateEvent;
import products.News;


public class NewsObserver implements Runnable {
    protected EventBus newsEventBus;
    protected News news;
    private static final int STOP_TIME_IN_MILLIS = 1000;

    public NewsObserver(EventBus eventBus, News news) {
        this.news = news;
        newsEventBus = eventBus;
    }

    public synchronized void build() {
    }

    @Subscribe
    protected void stopWhenStopEventOccurs(StopUpdateEvent stopEvent) {
        try {
            System.out.println("Ending: " + this.getClass());
            Thread.currentThread().join(STOP_TIME_IN_MILLIS);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    @Override
    public void run() {
        this.build();
    }
}
