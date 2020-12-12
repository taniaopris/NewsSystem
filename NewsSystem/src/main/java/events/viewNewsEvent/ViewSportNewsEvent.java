package events.viewNewsEvent;

import events.NewsEvent;
import products.News;

public class ViewSportNewsEvent extends NewsEvent {

    public ViewSportNewsEvent(News news) {
        super(news);
    }
}
