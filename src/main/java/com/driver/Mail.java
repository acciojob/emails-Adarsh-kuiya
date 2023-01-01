package com.driver;

import java.util.Date;

public class Mail {
    private Date date;
    private String message;
    private String sender;

    public Mail(Date date, String message, String sender) {
        this.date = date;
        this.message = message;
        this.sender = sender;
    }

    public Date getDate() {
        return date;
    }


    public String getMessage() {
        return message;
    }

}

