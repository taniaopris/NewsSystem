package events.viewNews;

import events.NewsViewEvent;
import products.News;

public class ViewPoliticsNewsEvent extends NewsViewEvent {

    public ViewPoliticsNewsEvent(News news) {
        super(news);
    }
}
