package products;

import com.google.common.eventbus.EventBus;
import observers.SubscriberNewsObserver;
import observers.subscribersObserver.*;

import java.util.ArrayList;
import java.util.List;

public class Viewer {
    private String name;
    private List<SubscriberNewsObserver> domainsOfInterest;

    public Viewer(String name, ArrayList<News.NewsType> domainsOfInterest, EventBus newsEventBus) {
        this.name = name;
        this.domainsOfInterest = new ArrayList<>();

        for (News.NewsType domain : domainsOfInterest) {
            registerSubscriber(domain, newsEventBus);
        }
    }

    private void registerSubscriber(News.NewsType domain, EventBus newsEventBus){
        switch (domain){
            case Cultural: domainsOfInterest.add(new CulturalNewsSubscriber(newsEventBus, this.name)); break;
            case Financial: domainsOfInterest.add(new FinancialNewsSubscriber(newsEventBus, this.name)); break;
            case Policy: domainsOfInterest.add(new PolicyNewsSubscriber(newsEventBus, this.name)); break;
            case Social: domainsOfInterest.add(new SocialNewsSubscriber(newsEventBus, this.name)); break;
            case Sport: domainsOfInterest.add(new SportNewsSubscriber(newsEventBus, this.name)); break;
        }
    }
}
