package com.driver;

import java.util.Date;

public class Mail {
    Date date;
    String message;
    String sender;

    public Mail(Date date, String message, String sender) {
        this.date = date;
        this.message = message;
        this.sender = sender;
    }
}

