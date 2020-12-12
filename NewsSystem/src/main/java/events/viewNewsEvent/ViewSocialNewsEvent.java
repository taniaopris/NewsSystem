package events.viewNewsEvent;

import events.NewsEvent;
import products.News;

public class ViewSocialNewsEvent extends NewsEvent {

    public ViewSocialNewsEvent(News news) {
        super(news);
    }
}
