package observers.subscribersObserver;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import events.NewsViewEvent;
import events.publishNews.PublishSportNewsEvent;
import events.viewNews.ViewSportNewsEvent;
import observers.SubscriberNewsObserver;
import units.News;

public class SportNewsSubscriber extends SubscriberNewsObserver {

    public SportNewsSubscriber(EventBus newsEventBus, String viewerName) {
        super(newsEventBus,viewerName);
    }

    @Subscribe
    private void subscribeTo(PublishSportNewsEvent newsEvent) {
        this.readNews(newsEvent.getNewsEvent());

        News news = newsEvent.getNewsEvent();
        NewsViewEvent viewNews = new ViewSportNewsEvent(news);
        newsEventBus.post(viewNews);
    }

}
