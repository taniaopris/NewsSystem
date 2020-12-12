package events.updateNewsContent;

import events.NewsEvent;
import products.News;

public class UpdatePolicyNewsEvent extends NewsEvent {

    public UpdatePolicyNewsEvent(News news) {
        super(news);
    }
}
