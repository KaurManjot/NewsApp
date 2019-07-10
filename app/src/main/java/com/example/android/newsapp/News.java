package com.example.android.newsapp;

public class News {

    /** Title of the news */
    private String title;

    /** Section of the news */
    private String section;

    /** Time of the news */
    private String publicationDate;

    /** Website URL of the news */
    private String url;

    /** Website Author of the news */
    private String author;

    /**
     *
     * @param title
     * @param section
     * @param publicationDate date when the news was published
     * @param url
     */
    public News(String title, String section, String publicationDate, String url, String author) {
        this.title = title;
        this.section = section;
        this.publicationDate = publicationDate;
        this.url = url;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getSection() {
        return section;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public String getUrl() {
        return url;
    }

    public String getAuthor() {
        return author;
    }
}
