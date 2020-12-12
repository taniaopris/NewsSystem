import com.google.common.eventbus.EventBus;
import events.updateNewsContent.UpdateCulturalNewsEvent;

public class Main {

    public static void main(String[] args) {
        EventBus mEventBus = new EventBus("newsSystem");

        PublisherManagers pManager = new PublisherManagers();

        pManager.initializePublishers(mEventBus);

        pManager.startPublishing(mEventBus);



    }

}
