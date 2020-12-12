package observers.subscribers;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import events.updateNewsContent.UpdateSportNewsEvent;
import events.viewNewsEvent.ViewSportNewsEvent;
import observers.NewsObserver;
import products.News;

public class SportNewsSubscriber extends NewsObserver {

    public SportNewsSubscriber(EventBus eventBus, News news) {
        super(eventBus,news);
        newsEventBus.register(this);
    }

    @Subscribe
    private void subscribeTo(UpdateSportNewsEvent newsEvent) {
        news = newsEvent.getNewsEvent();
        news.updateViews();
        newsEventBus.post(new ViewSportNewsEvent(news));
    }

}
