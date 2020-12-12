package events.viewNewsEvent;

import events.NewsEvent;
import products.News;

public class ViewFinancialNewsEvent extends NewsEvent {

    public ViewFinancialNewsEvent(News news) {
        super(news);
    }
}
