import com.google.common.eventbus.EventBus;
import events.NewsViewEvent;
import events.viewNews.ViewSportNewsEvent;
import products.News;
import products.Publisher;
import products.Viewer;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        EventBus newsEventBus = new EventBus();
        ArrayList<News.NewsType> domains1 = new ArrayList<>(Arrays.asList(News.NewsType.Sport, News.NewsType.Cultural));
        ArrayList<News.NewsType> domains2 = new ArrayList<>(Arrays.asList(News.NewsType.Social));

        Publisher toma = new Publisher(newsEventBus, "Toma");
        Publisher anca = new Publisher(newsEventBus, "Anca");

        Viewer edgar = new Viewer("Edgar", domains1, newsEventBus);
        Viewer tania = new Viewer("Tania", domains2, newsEventBus);


        News sportNews = toma.createNews("Pandurii TG-Jiu a luat bataie... din nou.", News.NewsType.Sport);

        News socialNews = anca.createNews("Let's make money.", News.NewsType.Social);

        News culturalNews = anca.createNews("Culture is nice.", News.NewsType.Cultural);

        toma.updateNews(sportNews,"De fapt a castigat ;)");

    }

}
