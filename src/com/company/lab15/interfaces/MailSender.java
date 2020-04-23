package com.company.lab15.interfaces;

/**
 * Интерфейс для описания механизма отправки письма
 */
public interface MailSender {

    /**
     * Метод для создания письма
     * @param mail
     * @return
     */
    String createMail(String mail);

    /**
     * Метод для отправки письма
     * @param mail
     */
    void sendMail(String mail);

}
