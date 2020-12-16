package observers.publisherObserver;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import events.viewNews.ViewFinancialNewsEvent;
import observers.PublisherNewsObserver;
import units.Publisher;

public class FinancialNewsPublisher extends PublisherNewsObserver {

    public FinancialNewsPublisher(EventBus eventBus, Publisher publisher) {
        super(eventBus,publisher);
    }

    @Subscribe
    private void newsViewEvent(ViewFinancialNewsEvent event) {
        this.showNewsStatistics(event.getNewsEvent());
    }
}
