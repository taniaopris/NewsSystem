package observers.publisher;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import events.StopUpdateEvent;
import events.updateNewsEvent.UpdatePolicyNewsEvent;
import events.viewNewsEvent.ViewPolicyNewsEvent;
import observers.NewsObserver;
import products.News;

public class PolicyNewsPublisher extends NewsObserver {
    private int WAIT_TIME_IN_MILLIS = 2000;

    public PolicyNewsPublisher(EventBus eventBus, News news) {
        super(eventBus,news);
        newsEventBus.register(this);
    }

    @Subscribe
    private void subscribeTo(ViewPolicyNewsEvent newsEvent) {
            news = newsEvent.getNewsEvent();
            if (news.getNoViews() < 3) {
                news.updateNews();
                newsEventBus.post(new UpdatePolicyNewsEvent(news));
                System.out.println("da3");
            } else {
                newsEventBus.post(new StopUpdateEvent());
            }
    }
}
