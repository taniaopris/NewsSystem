package observers.subscribersObserver;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import events.NewsViewEvent;
import events.publishNews.PublishFinancialNewsEvent;
import events.viewNews.ViewFinancialNewsEvent;
import observers.SubscriberNewsObserver;
import products.News;

public class FinancialNewsSubscriber extends SubscriberNewsObserver {

    public FinancialNewsSubscriber(EventBus newsEventBus, String viewerName) {
        super(newsEventBus,viewerName);
    }

    @Subscribe
    private void subscribeTo(PublishFinancialNewsEvent newsEvent) {
        this.readNews(newsEvent.getNewsEvent());

        News news = newsEvent.getNewsEvent();
        NewsViewEvent viewNews = new ViewFinancialNewsEvent(news);
        newsEventBus.post(viewNews);
    }

}
