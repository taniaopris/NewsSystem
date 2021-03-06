package observers.publisher;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import events.StopUpdateEvent;
import events.updateNewsEvent.UpdateCulturalNewsEvent;
import events.viewNewsEvent.ViewCulturalNewsEvent;
import observers.NewsObserver;
import products.News;

public class CulturalNewsPublisher extends NewsObserver {
    private int WAIT_TIME_IN_MILLIS = 2000;

    public CulturalNewsPublisher(EventBus eventBus, News news) {
        super(eventBus,news);
        newsEventBus.register(this);
    }

    @Subscribe
    private void subscribeTo(ViewCulturalNewsEvent newsEvent) {
            news = newsEvent.getNewsEvent();
            if (news.getNoViews() < 5) {
                news.updateNews();
                newsEventBus.post(new UpdateCulturalNewsEvent(news));
                System.out.println("Update no." + news.getNoViews() + " was posted!");
            } else {
                newsEventBus.post(new StopUpdateEvent());
            }
    }


}
