import com.google.common.eventbus.EventBus;
import units.News;
import units.Publisher;
import units.Viewer;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        EventBus newsEventBus = new EventBus();
        ArrayList<News.NewsType> domains1 = new ArrayList<>(Arrays.asList(News.NewsType.Sport, News.NewsType.Politics));
        ArrayList<News.NewsType> domains2 = new ArrayList<>(Arrays.asList(News.NewsType.Social));
        ArrayList<News.NewsType> domains3 = new ArrayList<>(Arrays.asList(News.NewsType.Financial));

        Publisher  StephenCollinson = new Publisher(newsEventBus, "Stephen Collinson");
        Publisher JenniferSteinhauer = new Publisher(newsEventBus, "Jennifer Steinhauer");
        Publisher ChandlerThornton = new Publisher(newsEventBus, "Chandler Thornton");
        Publisher MichelleToh = new Publisher(newsEventBus, "Michelle Toh");

        Viewer Emily = new Viewer("Emily", domains1, newsEventBus);
        Viewer Kevin = new Viewer("Kevin", domains2, newsEventBus);
        Viewer Bob = new Viewer("Bob", domains3, newsEventBus);


        News politicsNews = StephenCollinson.createNews("McConnell sets stage for new face-off with Biden after delivering blow to Trump's election fantasy.", News.NewsType.Politics);
        News sportNews = StephenCollinson.createNews("Can Mick Schumacher emulate his father Michael in Formula One?", News.NewsType.Sport);
        News socialNews1 = JenniferSteinhauer.createNews("Tom Cruise reportedly scolds 'Mission: Impossible 7' crew members for violating social distancing measures.", News.NewsType.Social);
        News socialNews2 = ChandlerThornton.createNews("Britney Spears' father speaks out as she requests to remove him as conservator of her estate.", News.NewsType.Social);
        News financialNews = MichelleToh.createNews("China's luxury market boomed this year, even as global sales shrank.", News.NewsType.Financial);

        StephenCollinson.updateNews(sportNews,"Mick Schumacher racing as Mick Junior for KSM Racing Team on 5 October 2014, in Genk, Belgium.");
        StephenCollinson.updateNews(sportNews,"He knows he has his name and he's capable of managing the pressure, says Rosin.");

    }

}
