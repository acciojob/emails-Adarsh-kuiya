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

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}

