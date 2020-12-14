package events.publishNews;

import events.NewsUpdateEvent;
import products.News;

public class PublishPolicyNewsEvent extends NewsUpdateEvent {

    public PublishPolicyNewsEvent(News news) {
        super(news);
    }
}
