package events;

import products.News;

public abstract class NewsViewEvent {
    private News news;

    public NewsViewEvent(News news) {
        this.news = news;
    }

    public News getNewsEvent() {
        return news;
    }
}
