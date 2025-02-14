package com.cobeliii;

public class Gmail implements EmailSender{
    @Override
    public void send(String from, String to) {
        System.out.println("Sending email via com.cobeliii.Gmail...");
    }
}
