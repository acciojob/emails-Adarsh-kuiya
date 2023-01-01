package com.driver;

import java.util.Date;

public class Mail {
    public Date date;
    public String message;
    public String sender;

    public Mail(Date date, String message, String sender) {
        this.date = date;
        this.message = message;
        this.sender = sender;
    }
}

