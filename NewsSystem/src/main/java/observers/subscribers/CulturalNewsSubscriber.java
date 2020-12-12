package observers.subscribers;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import events.updateNewsContent.UpdateCulturalNewsEvent;
import events.viewNewsEvent.ViewCulturalNewsEvent;
import observers.NewsObserver;
import products.News;

public class CulturalNewsSubscriber extends NewsObserver {

    public CulturalNewsSubscriber(EventBus eventBus, News news) {
        super(eventBus,news);
        newsEventBus.register(this);
    }

    @Subscribe
    private void subscribeTo(UpdateCulturalNewsEvent newsEvent) {
        news = newsEvent.getNewsEvent();
        news.updateViews();
        newsEventBus.post(new ViewCulturalNewsEvent(news));
        System.out.println("daa1");
    }

}
