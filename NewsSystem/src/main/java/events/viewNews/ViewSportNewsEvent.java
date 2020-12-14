package events.viewNews;

import events.NewsViewEvent;
import products.News;

public class ViewSportNewsEvent extends NewsViewEvent {

    public ViewSportNewsEvent(News news) {
        super(news);
    }
}
