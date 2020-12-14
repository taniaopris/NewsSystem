package observers.publisher;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import events.StopUpdateEvent;
import events.updateNewsEvent.UpdateSocialNewsEvent;
import events.viewNewsEvent.ViewSocialNewsEvent;
import observers.NewsObserver;
import products.News;

public class SocialNewsPublisher extends NewsObserver {
    private int WAIT_TIME_IN_MILLIS = 2000;

    public SocialNewsPublisher(EventBus eventBus, News news) {
        super(eventBus,news);
        newsEventBus.register(this);
    }

    @Subscribe
    private void subscribeTo(ViewSocialNewsEvent newsEvent) {
            news = newsEvent.getNewsEvent();
            if (news.getNoViews() < 3) {
                news.updateNews();
                newsEventBus.post(new UpdateSocialNewsEvent(news));
                System.out.println("da4");
            } else {
                newsEventBus.post(new StopUpdateEvent());
            }
    }
}
