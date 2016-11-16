package com.design.moudle.observer;

/**
 * Created by zhuqiang on 16/10/23.
 */
public interface Subject {
    void  observerRegister(Observer o);
    void  observerRemove(Observer o);
    void  notifyObserver();
}
