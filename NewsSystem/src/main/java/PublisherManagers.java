import com.google.common.eventbus.EventBus;
import events.updateNewsContent.UpdateCulturalNewsEvent;
import observers.NewsObserver;
import observers.publisher.*;
import products.News;

import java.util.Date;

public class PublisherManagers {
    private NewsObserver culturalPublisher;
    private NewsObserver financialPublisher;
    private NewsObserver policyPublisher;
    private NewsObserver socialPublisher;
    private NewsObserver sportPublisher;

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
    }

    public void startPublishing() {
        Thread culturalJob = new Thread(culturalPublisher);
        Thread financialJob = new Thread(financialPublisher);
        Thread policyJob = new Thread(policyPublisher);
        Thread socialJob = new Thread(socialPublisher);
        Thread sportJob = new Thread(sportPublisher);

//        Thread culturalJob = new Thread(new Runnable() {
//            public void run() {
//                culturalPublisher.build();
//            }
//        });
//        Thread financialJob = new Thread(new Runnable() {
//            public void run() {
//                financialPublisher.build();
//            }
//        });
//        Thread policyJob = new Thread(new Runnable() {
//            public void run() {
//                policyPublisher.build();
//            }
//        });
//        Thread socialJob = new Thread(new Runnable() {
//            public void run() {
//                socialPublisher.build();
//            }
//        });
//        Thread sportJob = new Thread(new Runnable() {
//            public void run() {
//                sportPublisher.build();
//            }
//        });

        culturalJob.start();
        financialJob.start();
        policyJob.start();
        socialJob.start();
        sportJob.start();
    }

}
