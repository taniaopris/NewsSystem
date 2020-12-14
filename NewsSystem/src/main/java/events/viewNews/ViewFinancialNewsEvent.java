package events.viewNews;

import events.NewsViewEvent;
import products.News;

public class ViewFinancialNewsEvent extends NewsViewEvent {

    public ViewFinancialNewsEvent(News news) {
        super(news);
    }
}
