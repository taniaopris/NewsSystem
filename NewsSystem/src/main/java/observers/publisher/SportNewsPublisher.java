package observers.publisher;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import events.StopUpdateEvent;
import events.updateNewsContent.UpdateSocialNewsEvent;
import events.updateNewsContent.UpdateSportNewsEvent;
import events.viewNewsEvent.ViewSportNewsEvent;
import observers.NewsObserver;
import products.News;

public class SportNewsPublisher extends NewsObserver {
    private int WAIT_TIME_IN_MILLIS = 2000;

    public SportNewsPublisher(EventBus eventBus, News news) {
        super(eventBus,news);
        newsEventBus.register(this);
    }

    @Subscribe
    private void subscribeTo(ViewSportNewsEvent newsEvent) {
        try {
            Thread.currentThread().wait(WAIT_TIME_IN_MILLIS);
            news = newsEvent.getNewsEvent();
            if (news.getNoViews() < 5) {
                news.updateNews();
                newsEventBus.post(new UpdateSportNewsEvent(news));
                System.out.println("da5");
            } else {
                newsEventBus.post(new StopUpdateEvent());
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
