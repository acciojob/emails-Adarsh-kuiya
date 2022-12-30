package com.driver;

import java.util.Date;

public class Mail {
    String message;
    String sender;
    Date date;

    public Mail(Date message, String sender, String date) {
        this.message = message;
        this.sender = sender;
        this.date = date;
    }
}

