package observers.subscribers;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import events.updateNewsContent.UpdatePolicyNewsEvent;
import events.viewNewsEvent.ViewPolicyNewsEvent;
import observers.NewsObserver;
import products.News;

public class PolicyNewsSubscriber extends NewsObserver {

    public PolicyNewsSubscriber(EventBus eventBus, News news) {
        super(eventBus,news);
        newsEventBus.register(this);
    }

    @Subscribe
    private void subscribeTo(UpdatePolicyNewsEvent newsEvent) {
        news = newsEvent.getNewsEvent();
        news.updateViews();
        newsEventBus.post(new ViewPolicyNewsEvent(news));
        System.out.println("daa3");
    }
}
