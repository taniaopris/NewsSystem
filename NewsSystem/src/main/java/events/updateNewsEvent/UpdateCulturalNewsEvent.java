package events.updateNewsEvent;

import events.NewsEvent;
import products.News;

public class UpdateCulturalNewsEvent extends NewsEvent {

    public UpdateCulturalNewsEvent(News news) {
        super(news);
    }
}
