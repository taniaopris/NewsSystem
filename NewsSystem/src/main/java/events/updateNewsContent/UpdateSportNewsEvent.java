package events.updateNewsContent;

import events.NewsEvent;
import products.News;

public class UpdateSportNewsEvent extends NewsEvent {

    public UpdateSportNewsEvent(News news) { super(news); }
}
