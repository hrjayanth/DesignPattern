package com.learn.jay;

import com.learn.jay.Collection.NotificationCollection;

public class MainClass {
    public static void main(String args[]) {
        NotificationCollection nc = new NotificationCollection();
        NotificationBar nb = new NotificationBar(nc);
        nb.printNotifications();
    }
}
