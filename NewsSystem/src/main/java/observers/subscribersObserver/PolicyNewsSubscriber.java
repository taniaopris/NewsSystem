package observers.subscribersObserver;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import events.NewsViewEvent;
import events.publishNews.PublishPolicyNewsEvent;
import events.viewNews.ViewPolicyNewsEvent;
import observers.SubscriberNewsObserver;
import products.News;

public class PolicyNewsSubscriber extends SubscriberNewsObserver {

    public PolicyNewsSubscriber(EventBus newsEventBus, String viewerName) {
        super(newsEventBus,viewerName);
    }

    @Subscribe
    private void subscribeTo(PublishPolicyNewsEvent newsEvent) {
        this.readNews(newsEvent.getNewsEvent());

        News news = newsEvent.getNewsEvent();
        NewsViewEvent viewNews = new ViewPolicyNewsEvent(news);
        newsEventBus.post(viewNews);
    }
}
