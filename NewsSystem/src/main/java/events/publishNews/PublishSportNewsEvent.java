package events.publishNews;

import events.NewsUpdateEvent;
import units.News;

public class PublishSportNewsEvent extends NewsUpdateEvent {

    public PublishSportNewsEvent(News news) { super(news); }
}
