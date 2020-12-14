package events.viewNews;

import events.NewsViewEvent;
import products.News;

public class ViewSocialNewsEvent extends NewsViewEvent {

    public ViewSocialNewsEvent(News news) {
        super(news);
    }
}
