package observers.publisherObserver;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import events.viewNews.ViewSportNewsEvent;
import observers.PublisherNewsObserver;
import products.Publisher;

public class SportNewsPublisher extends PublisherNewsObserver {

    public SportNewsPublisher(EventBus eventBus, Publisher publisher) {
        super(eventBus,publisher);
    }

    @Subscribe
    private void newsViewEvent(ViewSportNewsEvent event) {
        this.showNewsStatistics(event.getNewsEvent());
    }
}
