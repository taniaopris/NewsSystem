package products;

import com.google.common.eventbus.EventBus;
import events.NewsUpdateEvent;
import events.publishNews.*;
import observers.publisherObserver.*;

public class Publisher {
    private EventBus newsEventBus;
    private String publisherName;

    public Publisher(EventBus newsEventBus, String publisherName) {
        this.newsEventBus = newsEventBus;
        this.publisherName = publisherName;
        newsEventBus.register(this);
    }

    public News createNews(String information, News.NewsType domain) {
        News news = new News(information,this,domain);
        publishNews(news);
        registerPublisher(domain,newsEventBus);
        return news;
    }

    public void updateNews(News news, String newInformation) {
        if (news.getPublisher().equals(this)) {
            news.updateNews(newInformation);
            publishNews(news);
        }
    }

    private void publishNews(News news) {
        NewsUpdateEvent event = null;

        switch (news.getDomain()) {
            case Cultural:
                event = new PublishCulturalNewsEvent(news);
                break;
            case Financial:
                event = new PublishFinancialNewsEvent(news);
                break;
            case Policy:
                event = new PublishPolicyNewsEvent(news);
                break;
            case Social:
                event = new PublishSocialNewsEvent(news);
                break;
            case Sport:
                event = new PublishSportNewsEvent(news);
                break;
        }
        newsEventBus.post(event);
    }

    public String getPublisherName() {
        return publisherName;
    }

    private void registerPublisher(News.NewsType domain, EventBus newsEventBus){
        switch (domain){
            case Cultural: new CulturalNewsPublisher(newsEventBus, this); break;
            case Financial: new FinancialNewsPublisher(newsEventBus, this); break;
            case Policy: new PolicyNewsPublisher(newsEventBus, this); break;
            case Social: new SocialNewsPublisher(newsEventBus, this); break;
            case Sport: new SportNewsPublisher(newsEventBus, this); break;
        }
    }
}
