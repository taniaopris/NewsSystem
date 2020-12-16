package events.viewNews;

import events.NewsViewEvent;
import units.News;

public class ViewSportNewsEvent extends NewsViewEvent {

    public ViewSportNewsEvent(News news) {
        super(news);
    }
}
