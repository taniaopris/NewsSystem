package observers.subscribersObserver;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import events.NewsViewEvent;
import events.publishNews.PublishPoliticsNewsEvent;
import events.viewNews.ViewPoliticsNewsEvent;
import observers.SubscriberNewsObserver;
import units.News;

public class PoliticsNewsSubscriber extends SubscriberNewsObserver {

    public PoliticsNewsSubscriber(EventBus newsEventBus, String viewerName) {
        super(newsEventBus,viewerName);
    }

    @Subscribe
    private void subscribeTo(PublishPoliticsNewsEvent newsEvent) {
        this.readNews(newsEvent.getNewsEvent());

        News news = newsEvent.getNewsEvent();
        NewsViewEvent viewNews = new ViewPoliticsNewsEvent(news);
        newsEventBus.post(viewNews);
    }
}
