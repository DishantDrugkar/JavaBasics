package org.example.multithreading.threadscreation;

public class Test {
    public static void main(String[] args) {
      //  ThreadExtends threadExtends = new ThreadExtends();
      //  threadExtends.start();

        RunnableInterface runnableInterface = new RunnableInterface(); // NEW
        Thread t1 = new Thread(runnableInterface);
        t1.start(); // RUNNABLE
    }
}
