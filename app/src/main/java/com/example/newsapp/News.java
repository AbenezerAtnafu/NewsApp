package com.example.newsapp;

public class News {

    private String title;
    private String date;
    private String section;
    private String author;
    private String webUrl;

    public News(String title, String date, String section, String author, String webUrl) {
        this.title = title;
        this.date = date;
        this.section = section;
        this.author = author;
        this.webUrl = webUrl;
    }

    public News(String title, String date, String section, String author) {
        this.title = title;
        this.date = date;
        this.section = section;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getSection() {
        return section;
    }

    public String getAuthor() {
        return author;
    }

    public String getWebUrl() {
        return webUrl;
    }
}
