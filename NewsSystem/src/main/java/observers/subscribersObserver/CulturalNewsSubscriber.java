package observers.subscribersObserver;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import events.NewsViewEvent;
import events.publishNews.PublishCulturalNewsEvent;
import events.viewNews.ViewCulturalNewsEvent;
import observers.SubscriberNewsObserver;
import units.News;

public class CulturalNewsSubscriber extends SubscriberNewsObserver {

    public CulturalNewsSubscriber(EventBus newsEventBus, String viewerName) {
        super(newsEventBus,viewerName);
    }

    @Subscribe
    private void subscribeTo(PublishCulturalNewsEvent newsEvent) {
        this.readNews(newsEvent.getNewsEvent());

        News news = newsEvent.getNewsEvent();
        NewsViewEvent viewNews = new ViewCulturalNewsEvent(news);
        newsEventBus.post(viewNews);
    }

}
