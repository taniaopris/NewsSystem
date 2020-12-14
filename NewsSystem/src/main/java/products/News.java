package products;

import java.util.Date;

public class News {
    private Date publishDate;
    private Date lastModifiedDate;
    private String information;
    private Publisher author;
    private NewsType domain;
    private int noViews = 0;

    public enum NewsType {
        Cultural,
        Financial,
        Policy,
        Social,
        Sport
    }

    public News(String information, Publisher author, NewsType domain) {
        this.publishDate = new Date();
        this.lastModifiedDate = this.publishDate;
        this.information = information;
        this.author = author;
        this.domain = domain;
    }

    public void updateNews(String newInformation) {
        Date currentDate = new Date();
        this.lastModifiedDate = currentDate;
        this.information = newInformation;
    }

    public String getInformation() {
        return information;
    }

    public Publisher getPublisher() {
        return author;
    }

    public NewsType getDomain() {
        return domain;
    }

    public void updateNoOfViews() {
        noViews++;
    }

    public int getNoOfViews() {
        return noViews;
    }

}