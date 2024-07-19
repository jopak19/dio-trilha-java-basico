package me.dio.pattern;

public class TelegramNotificationObserver implements iEventListener{
    NotificationObservable notificationSystem;

    TelegramNotificationObserver(NotificationObservable notificationSystem){
        this.notificationSystem = notificationSystem;
        notificationSystem.subscribe(this);
    }

    @Override
    public void update() {
        sendMessage(this.notificationSystem.getNotificationState());
    }
    
    void sendMessage(String message){
        System.out.println("mensagem enviada pelo telegram: " + message);
    }
   

}
