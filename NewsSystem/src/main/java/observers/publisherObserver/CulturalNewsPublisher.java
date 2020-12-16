package observers.publisherObserver;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import events.viewNews.ViewCulturalNewsEvent;
import observers.PublisherNewsObserver;
import units.Publisher;

public class CulturalNewsPublisher extends PublisherNewsObserver {

    public CulturalNewsPublisher(EventBus eventBus, Publisher publisher) {
        super(eventBus,publisher);
    }

    @Subscribe
    private void newsViewEvent(ViewCulturalNewsEvent event) {
        this.showNewsStatistics(event.getNewsEvent());
    }
}
