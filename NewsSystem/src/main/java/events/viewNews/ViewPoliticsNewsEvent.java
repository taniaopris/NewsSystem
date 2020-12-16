package events.viewNews;

import events.NewsViewEvent;
import units.News;

public class ViewPoliticsNewsEvent extends NewsViewEvent {

    public ViewPoliticsNewsEvent(News news) {
        super(news);
    }
}
