package observers.subscribers;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import events.updateNewsContent.UpdateFinancialNewsEvent;
import events.viewNewsEvent.ViewFinancialNewsEvent;
import observers.NewsObserver;
import products.News;

public class FinancialNewsSubscriber extends NewsObserver {

    public FinancialNewsSubscriber(EventBus eventBus, News news) {
        super(eventBus,news);
        newsEventBus.register(this);
    }

    @Subscribe
    private void subscribeTo(UpdateFinancialNewsEvent newsEvent) {
        news = newsEvent.getNewsEvent();
        news.updateViews();
        newsEventBus.post(new ViewFinancialNewsEvent(news));
    }

}
