package com.cobeliii;

public class Hotmail implements EmailSender{
    @Override
    public void send(String from, String to) {
        System.out.println("Sending email via com.cobeliii.Hotmail...");
    }
}
