package observers.subscribersObserver;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import events.NewsViewEvent;
import events.publishNews.PublishSocialNewsEvent;
import events.viewNews.ViewSocialNewsEvent;
import observers.SubscriberNewsObserver;
import units.News;

public class SocialNewsSubscriber extends SubscriberNewsObserver {

    public SocialNewsSubscriber(EventBus newsEventBus, String viewerName) {
        super(newsEventBus,viewerName);
    }

    @Subscribe
    private void subscribeTo(PublishSocialNewsEvent newsEvent) {
        this.readNews(newsEvent.getNewsEvent());

        News news = newsEvent.getNewsEvent();
        NewsViewEvent viewNews = new ViewSocialNewsEvent(news);
        newsEventBus.post(viewNews);
    }
}
