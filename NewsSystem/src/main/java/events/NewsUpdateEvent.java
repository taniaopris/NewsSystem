package events;

import products.News;

public abstract class NewsUpdateEvent {
    private News news;

    public NewsUpdateEvent(News news) {
        this.news = news;
    }

    public News getNewsEvent() {
        return news;
    }
}