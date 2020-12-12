package events.updateNewsContent;

import events.NewsEvent;
import products.News;

public class UpdateFinancialNewsEvent extends NewsEvent {

    public UpdateFinancialNewsEvent(News news) {
        super(news);
    }
}
