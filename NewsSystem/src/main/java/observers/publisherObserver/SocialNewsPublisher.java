package observers.publisherObserver;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import events.viewNews.ViewSocialNewsEvent;
import observers.PublisherNewsObserver;

import products.Publisher;

public class SocialNewsPublisher extends PublisherNewsObserver {

    public SocialNewsPublisher(EventBus eventBus, Publisher publisher) {
        super(eventBus,publisher);
    }

    @Subscribe
    private void newsViewEvent(ViewSocialNewsEvent event) {
        this.showNewsStatistics(event.getNewsEvent());
    }
}
