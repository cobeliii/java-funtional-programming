package com.cobeliii;

@FunctionalInterface
public interface EmailSender {
    void send(String from, String to);
}
