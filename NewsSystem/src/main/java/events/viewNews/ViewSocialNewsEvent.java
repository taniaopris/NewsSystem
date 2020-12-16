package events.viewNews;

import events.NewsViewEvent;
import units.News;

public class ViewSocialNewsEvent extends NewsViewEvent {

    public ViewSocialNewsEvent(News news) {
        super(news);
    }
}
