package events.viewNews;

import events.NewsViewEvent;
import products.News;

public class ViewCulturalNewsEvent extends NewsViewEvent {

    public ViewCulturalNewsEvent(News news) {
        super(news);
    }
}
