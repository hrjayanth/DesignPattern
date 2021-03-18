package com.learn.jay;

import com.learn.jay.observable.NewsAgency;
import com.learn.jay.observer.Channel;
import com.learn.jay.observer.NDTVNewsChannel;
import com.learn.jay.observer.RepublicNewsChannel;

import static java.lang.Thread.sleep;

public class Tester {
    public static void main(String[] args) throws InterruptedException {
        NewsAgency agency = new NewsAgency();
        Channel republic = new RepublicNewsChannel();
        Channel ndtv = new NDTVNewsChannel();
        agency.addObserver(republic);
        agency.addObserver(ndtv);

        agency.setNews("India Wins Test Series in Australia");

        sleep(10000);
        agency.setNews("India celebrates Republic day on 26th Jan");

        // unsubscribing one of the observer from the News agency
        agency.removeObserver(ndtv);

        sleep(10000);
        agency.setNews("Joe Biden takes oath as the President of USA");
    }
}
