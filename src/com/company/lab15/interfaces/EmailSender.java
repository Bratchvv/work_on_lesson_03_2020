package com.company.lab15.interfaces;

/**
 * Интерфейс для описания механизма отправки электронного письма
 */
public interface EmailSender extends MailSender {

    /**
     * Метод для редактирования письма
     * @param mail
     */
    String editMail(String mail);
}
