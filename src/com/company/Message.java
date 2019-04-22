package com.company;
import static javax.swing.JOptionPane.*;
//Супер класс сообщений для ввода и вывода
//Демонстрация связи Is a (ассоциации).
public class Message {
    private String title = "Автризация";

    public String InputPassword() {
        return showInputDialog(null,
                "Введите пароль",
                title,
                PLAIN_MESSAGE);
    }

    public String ChoiseRole(String [] roles) {
        return (String)showInputDialog(null,
                "Выберите роль",
                title,
                PLAIN_MESSAGE,
                null,
                roles,
                roles[0]);
    }

    public void ShowResult(String role, String login) {
        showMessageDialog(null,
                "Вы авторизовались под именем: " + role,
                "Привет " + login,
                PLAIN_MESSAGE);
    }
}
