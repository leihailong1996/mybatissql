package com.ouyeel.util;

public class SqlThread implements   Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
