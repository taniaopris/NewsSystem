package observers.subscribers;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import events.updateNewsContent.UpdateSocialNewsEvent;
import events.viewNewsEvent.ViewSocialNewsEvent;
import observers.NewsObserver;
import products.News;

public class SocialNewsSubscriber extends NewsObserver {

    public SocialNewsSubscriber(EventBus eventBus, News news) {
        super(eventBus,news);
        newsEventBus.register(this);
    }

    @Subscribe
    private void subscribeTo(UpdateSocialNewsEvent newsEvent) {
        news = newsEvent.getNewsEvent();
        news.updateViews();
        newsEventBus.post(new ViewSocialNewsEvent(news));
        System.out.println("daa4");
    }
}
