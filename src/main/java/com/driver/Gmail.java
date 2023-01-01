package com.driver;

import java.util.ArrayList;
import java.util.Date;

public class Gmail extends Email {

    int inboxCapacity; //maximum number of mails inbox can store
    //Inbox: Stores mails. Each mail has date (Date), sender (String), message (String). It is guaranteed that message is distinct for all mails.
    //Trash: Stores mails. Each mail has date (Date), sender (String), message (String)
    private ArrayList<Mail> inbox;
     private ArrayList<Mail>trash;
    public Gmail(String emailId, int inboxCapacity) {
    super(emailId);
    this.inboxCapacity=inboxCapacity;
    this.inbox=new ArrayList<>();
    this.trash=new ArrayList<>();

    }

    public void receiveMail(Date date, String sender, String message){
        // If the inbox is full, move the oldest mail in the inbox to trash and add the new mail to inbox.
        // It is guaranteed that:
        // 1. Each mail in the inbox is distinct.
        // 2. The mails are received in non-decreasing order. This means that the date of a new mail is greater than equal to the dates of mails received already.

        if(inbox.size()==inboxCapacity){
        Mail mail =inbox.get(0);
            trash.add(mail);
        inbox.remove(mail);


        }
     Mail mail = new Mail(date,sender,message);
        inbox.add(mail);
    }

    public void deleteMail(String message){
        // Each message is distinct
        // If the given message is found in any mail in the inbox, move the mail to trash, else do nothing
        Mail mail =null;
    for(int i=0;i<inbox.size();i++){
       Mail mail1 = inbox.get(i);
    if(message.equals(mail1.getMessage())){
        mail=mail1;
        break;
        }
    }
    if(mail!=null){
       trash.add(mail);
       inbox.remove(mail);
    }
    }
    public String findLatestMessage(){
        // If the inbox is empty, return null
        // Else, return the message of the latest mail present in the inbox
    if(inbox.isEmpty())return  null;
    Mail mail=inbox.get(inbox.size()-1);
    return mail.getMessage();
    }

    public String findOldestMessage(){
        // If the inbox is empty, return null
        // Else, return the message of the oldest mail present in the inbox
     if(inbox.isEmpty())return null;
     Mail mail= inbox.get(0);
    return mail.getMessage();
    }

    public int findMailsBetweenDates(Date start, Date end){
        //find number of mails in the inbox which are received between given dates
        //It is guaranteed that start date <= end date
    int count=0;
    for(int i=0;i<inbox.size();i++){
        Mail mail=inbox.get(i);
     if(mail.getDate().compareTo(start)>=0 &&mail.getDate().compareTo(end)<=0)count+=1;
         }
    return count;
    }

    public int getInboxSize(){
        // Return number of mails in inbox
    return inbox.size();
    }

    public int getTrashSize(){
        // Return number of mails in Trash
    return trash.size();
    }

    public void emptyTrash(){
     trash.clear();   // clear all mails in the trash

    }

    public int getInboxCapacity() {
    return inboxCapacity;      // Return the maximum number of mails that can be stored in the inbox
    }
}
