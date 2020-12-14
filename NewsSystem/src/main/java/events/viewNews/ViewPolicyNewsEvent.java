package events.viewNews;

import events.NewsViewEvent;
import products.News;

public class ViewPolicyNewsEvent extends NewsViewEvent {

    public ViewPolicyNewsEvent(News news) {
        super(news);
    }
}
