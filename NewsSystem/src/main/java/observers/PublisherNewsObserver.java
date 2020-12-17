package observers;

import com.google.common.eventbus.EventBus;
import units.News;
import units.Publisher;


public class PublisherNewsObserver{
    protected EventBus newsEventBus;
    protected Publisher publisher;

    public PublisherNewsObserver(EventBus eventBus, Publisher publisher) {
        this.publisher = publisher;
        newsEventBus = eventBus;
        newsEventBus.register(this);
    }

    protected void showNewsStatistics(News news) {
        if (news.getPublisher().getPublisherName().equals(publisher.getPublisherName())) {
            System.out.println("The news " + news.getInformation() + " published by " +  publisher.getPublisherName() + " was viewed " + news.getNoOfViews() + " time(s).\n");
        }
    }
}
