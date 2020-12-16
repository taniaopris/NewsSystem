package events.publishNews;

import events.NewsUpdateEvent;
import units.News;

public class PublishSocialNewsEvent extends NewsUpdateEvent {

    public PublishSocialNewsEvent(News news) {
        super(news);
    }
}
