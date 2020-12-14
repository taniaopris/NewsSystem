package events.publishNews;

import events.NewsUpdateEvent;
import products.News;

public class PublishSocialNewsEvent extends NewsUpdateEvent {

    public PublishSocialNewsEvent(News news) {
        super(news);
    }
}
