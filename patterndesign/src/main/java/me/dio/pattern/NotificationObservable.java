package me.dio.pattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationObservable {
    List<iEventListener> listenings;
    String notificationState;
   
    public NotificationObservable(){
        this.listenings = new ArrayList<iEventListener>();
    }

    void subscribe(iEventListener  listener){
        listenings.add(listener);
    }
    void unsubscribe(iEventListener listener){
        listenings.remove(listener);
    }
    void setNotificationState(String message){
        this.notificationState = message;
        notifyAllListeners();
    }
    String getNotificationState(){
        return this.notificationState;
    }

    public void notifyAllListeners() {
        listenings.forEach(listener -> listener.update());
    }         
}
