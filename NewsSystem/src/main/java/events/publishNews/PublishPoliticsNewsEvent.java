package events.publishNews;

import events.NewsUpdateEvent;
import units.News;

public class PublishPoliticsNewsEvent extends NewsUpdateEvent {

    public PublishPoliticsNewsEvent(News news) {
        super(news);
    }
}
