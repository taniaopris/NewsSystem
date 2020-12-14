package events.updateNewsEvent;

import events.NewsEvent;
import products.News;

public class UpdateSocialNewsEvent extends NewsEvent {

    public UpdateSocialNewsEvent(News news) {
        super(news);
    }
}
