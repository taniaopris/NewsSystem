package observers.publisher;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import events.StopUpdateEvent;
import events.updateNewsContent.UpdateCulturalNewsEvent;
import events.updateNewsContent.UpdateFinancialNewsEvent;
import events.viewNewsEvent.ViewFinancialNewsEvent;
import observers.NewsObserver;
import products.News;

public class FinancialNewsPublisher extends NewsObserver {
    private int WAIT_TIME_IN_MILLIS = 2000;

    public FinancialNewsPublisher(EventBus eventBus, News news) {
        super(eventBus,news);
        newsEventBus.register(this);
    }

    @Subscribe
    private void subscribeTo(ViewFinancialNewsEvent newsEvent) {
            news = newsEvent.getNewsEvent();
            if (news.getNoViews() < 5) {
                news.updateNews();
                newsEventBus.post(new UpdateFinancialNewsEvent(news));
                System.out.println("da2");
            } else {
                newsEventBus.post(new StopUpdateEvent());
            }
    }


}
