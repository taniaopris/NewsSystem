package events.publishNews;

import events.NewsUpdateEvent;
import products.News;

public class PublishSportNewsEvent extends NewsUpdateEvent {

    public PublishSportNewsEvent(News news) { super(news); }
}
