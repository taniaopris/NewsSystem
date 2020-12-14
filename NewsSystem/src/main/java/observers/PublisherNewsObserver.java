package observers;

import com.google.common.eventbus.EventBus;
import products.News;
import products.Publisher;


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
            System.out.println("The news " + news.getInformation() + " published by " +  publisher.getPublisherName() + " it was viewed " + news.getNoOfViews() + " times.");
        }
    }
}
