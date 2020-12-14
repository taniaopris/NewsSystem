package observers.publisherObserver;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import events.viewNews.ViewPolicyNewsEvent;
import observers.PublisherNewsObserver;
import products.Publisher;

public class PolicyNewsPublisher extends PublisherNewsObserver {

    public PolicyNewsPublisher(EventBus eventBus, Publisher publisher) {
        super(eventBus,publisher);
    }

    @Subscribe
    private void newsViewEvent(ViewPolicyNewsEvent event) {
        this.showNewsStatistics(event.getNewsEvent());
    }
}
