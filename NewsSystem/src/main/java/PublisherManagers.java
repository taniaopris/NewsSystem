import com.google.common.eventbus.EventBus;
import events.updateNewsContent.*;
import observers.NewsObserver;
import observers.publisher.*;
import observers.subscribers.*;
import products.News;

import java.util.Date;

public class PublisherManagers {
    private NewsObserver culturalPublisher;
    private NewsObserver financialPublisher;
    private NewsObserver policyPublisher;
    private NewsObserver socialPublisher;
    private NewsObserver sportPublisher;

    private NewsObserver culturalSubscriber;
    private NewsObserver financialSubscriber;
    private NewsObserver policySubscriber;
    private NewsObserver socialSubscriber;
    private NewsObserver sportSubscriber;



    public void initializePublishers(EventBus eventBus) {
        News culturalNews = new News("The sky is blue.", "Tomi");

        News financialNews = new News("The money is green.", "Tani");

        News policyNews = new News("The politicians are bad.", "Anck");

        News socialNews = new News("The alphabet is useless.", "Gar");

        News sportNews = new News("The Pandurii Targu Jiu is weak.", "Tomi");


        culturalPublisher = new CulturalNewsPublisher(eventBus,culturalNews);
        financialPublisher = new FinancialNewsPublisher(eventBus,financialNews);
        policyPublisher = new PolicyNewsPublisher(eventBus,policyNews);
        socialPublisher = new SocialNewsPublisher(eventBus,socialNews);
        sportPublisher = new SportNewsPublisher(eventBus,sportNews);

        culturalSubscriber = new CulturalNewsSubscriber(eventBus,culturalNews);
        financialSubscriber = new FinancialNewsSubscriber(eventBus,financialNews);
        policySubscriber = new PolicyNewsSubscriber(eventBus,policyNews);
        socialSubscriber = new SocialNewsSubscriber(eventBus,socialNews);
        sportSubscriber = new SportNewsSubscriber(eventBus,sportNews);
    }

    public void startPublishing(EventBus eventBus) {
        Thread culturalPublisherJob = new Thread(culturalPublisher);
        Thread financialPublisherJob = new Thread(financialPublisher);
        Thread policyPublisherJob = new Thread(policyPublisher);
        Thread socialPublisherJob = new Thread(socialPublisher);
        Thread sportPublisherJob = new Thread(sportPublisher);

        Thread culturalSubscriberJob = new Thread(culturalPublisher);
        Thread financialSubscriberJob = new Thread(financialPublisher);
        Thread policySubscriberJob = new Thread(policyPublisher);
        Thread socialSubscriberJob = new Thread(socialPublisher);
        Thread sportSubscriberJob = new Thread(sportPublisher);

        culturalPublisherJob.start();
        financialPublisherJob.start();
        policyPublisherJob.start();
        socialPublisherJob.start();
        sportPublisherJob.start();

        culturalSubscriberJob.start();
        financialSubscriberJob.start();
        policySubscriberJob.start();
        socialSubscriberJob.start();
        sportSubscriberJob.start();

        News news = culturalPublisher.getNews();
        eventBus.post(new UpdateCulturalNewsEvent(news));

        news = financialPublisher.getNews();
        eventBus.post(new UpdateFinancialNewsEvent(news));

        news = policyPublisher.getNews();
        eventBus.post(new UpdatePolicyNewsEvent(news));

        news = socialPublisher.getNews();
        eventBus.post(new UpdateSocialNewsEvent(news));

        news = sportPublisher.getNews();
        eventBus.post(new UpdateSportNewsEvent(news));

    }

}
