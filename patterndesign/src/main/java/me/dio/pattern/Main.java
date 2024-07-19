package me.dio.pattern;

public class Main {
    public static void main(String[] args) {
        NotificationObservable notificationSystem = new NotificationObservable();
        TelegramNotificationObserver telegramNotification = new TelegramNotificationObserver(notificationSystem);
        EmailNotificationObserver emailNotification = new EmailNotificationObserver(notificationSystem);

        notificationSystem.setNotificationState("Sistema de mensagem iniciado");
        notificationSystem.setNotificationState("INFO: novo usuario logado");
        notificationSystem.setNotificationState("ALERTA: senha de usuario alterado");
    }
}