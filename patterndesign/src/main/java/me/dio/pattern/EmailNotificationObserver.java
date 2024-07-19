package me.dio.pattern;

public class EmailNotificationObserver implements iEventListener{
    NotificationObservable notificationSystem;

    EmailNotificationObserver(NotificationObservable notificationSystem){
        this.notificationSystem = notificationSystem;
        notificationSystem.subscribe(this);
    }

    @Override
    public void update() {
        sendMessage(this.notificationSystem.getNotificationState());
    }
    
    void sendMessage(String message){
        System.out.println("mensagem enviada pelo email: " + message);
    }
   

}
