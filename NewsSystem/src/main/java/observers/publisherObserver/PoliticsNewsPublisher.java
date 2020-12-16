package observers.publisherObserver;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import events.viewNews.ViewPoliticsNewsEvent;
import observers.PublisherNewsObserver;
import units.Publisher;

public class PoliticsNewsPublisher extends PublisherNewsObserver {

    public PoliticsNewsPublisher(EventBus eventBus, Publisher publisher) {
        super(eventBus,publisher);
    }

    @Subscribe
    private void newsViewEvent(ViewPoliticsNewsEvent event) {
        this.showNewsStatistics(event.getNewsEvent());
    }
}
