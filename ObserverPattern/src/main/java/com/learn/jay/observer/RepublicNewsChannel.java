package com.learn.jay.observer;

public class RepublicNewsChannel implements Channel {
    private String news;

    @Override
    public void update(Object news) {
        this.setNews((String) news);
        this.broadcast();
    }

    @Override
    public void broadcast() {
        System.out.println("News from Republic: " + this.getNews());
    }

    public String getNews() {
        return this.news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
