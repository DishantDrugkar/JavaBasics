package org.example.multithreading.threadscreation;

public class RunnableInterface implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable");
    }
}
