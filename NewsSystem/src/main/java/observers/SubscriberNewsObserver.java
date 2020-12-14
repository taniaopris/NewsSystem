package observers;

import com.google.common.eventbus.EventBus;
import events.NewsViewEvent;
import products.News;

public class SubscriberNewsObserver {
    protected EventBus newsEventBus;
    private String viewerName;

    public SubscriberNewsObserver(EventBus newsEventBus, String viewerName){
        this.viewerName = viewerName;
        this.newsEventBus = newsEventBus;
        newsEventBus.register(this);
    }

    protected void readNews(News news){
        news.updateNoOfViews();
        System.out.println(viewerName + " read: " + news.getInformation());
    }
}
