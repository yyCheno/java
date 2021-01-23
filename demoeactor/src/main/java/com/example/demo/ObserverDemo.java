package com.example.demo;

import java.util.Observable;

public class ObserverDemo extends Observable {
    public static void main(String[] args) {
        ObserverDemo observerDemo = new ObserverDemo();

        observerDemo.addObserver((o,arg)->{
            System.out.println("发生变换");
        });
        observerDemo.addObserver((o,arg)->{
            System.out.println("发生变换2");
        });

        observerDemo.setChanged();
        observerDemo.notifyObservers();
    }
}
