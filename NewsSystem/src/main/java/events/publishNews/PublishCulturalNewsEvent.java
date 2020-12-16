package events.publishNews;

import events.NewsUpdateEvent;
import units.News;

public class PublishCulturalNewsEvent extends NewsUpdateEvent {

    public PublishCulturalNewsEvent(News news) {
        super(news);
    }
}
