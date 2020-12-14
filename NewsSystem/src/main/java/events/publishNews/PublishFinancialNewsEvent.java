package events.publishNews;

import events.NewsUpdateEvent;
import products.News;

public class PublishFinancialNewsEvent extends NewsUpdateEvent {

    public PublishFinancialNewsEvent(News news) {
        super(news);
    }
}