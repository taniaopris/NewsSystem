package events.publishNews;

import events.NewsUpdateEvent;
import products.News;

public class PublishPoliticsNewsEvent extends NewsUpdateEvent {

    public PublishPoliticsNewsEvent(News news) {
        super(news);
    }
}
