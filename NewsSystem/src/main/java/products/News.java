package products;

import java.util.Date;

public class News{
    private Date publishDate;
    private Date lastModifiedDate;
    private String information;
    private String author;
    private int noViews = 0;

    public News(String information, String author) {
        this.publishDate = new Date();
        this.lastModifiedDate = this.publishDate;
        this.information = information;
        this.author = author;
    }

    public void updateNews() {
        Date currentDate = new Date();
        this.lastModifiedDate = currentDate;
    }

    public void updateViews() {
        noViews++;
    }

    public int getNoViews() { return noViews; }

}