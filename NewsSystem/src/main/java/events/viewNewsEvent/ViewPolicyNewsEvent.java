package events.viewNewsEvent;

import events.NewsEvent;
import products.News;

public class ViewPolicyNewsEvent extends NewsEvent {

    public ViewPolicyNewsEvent(News news) {
        super(news);
    }
}
