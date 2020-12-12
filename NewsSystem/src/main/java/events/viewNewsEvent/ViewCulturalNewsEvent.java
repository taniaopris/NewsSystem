package events.viewNewsEvent;

import events.NewsEvent;
import products.News;

public class ViewCulturalNewsEvent extends NewsEvent {

    public ViewCulturalNewsEvent(News news) {
        super(news);
    }
}
