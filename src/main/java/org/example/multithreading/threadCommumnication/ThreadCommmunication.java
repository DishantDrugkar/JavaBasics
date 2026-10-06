package org.example.multithreading.threadCommumnication;

public class ThreadCommmunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread producedThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));

        producedThread.start();
        consumerThread.start();

    }
}
