package events;

import products.News;

public abstract class NewsEvent {
    private News news;

    public NewsEvent(News news) {
        this.news = news;
    }

    public synchronized News getNewsEvent() {
        return news;
    }

}