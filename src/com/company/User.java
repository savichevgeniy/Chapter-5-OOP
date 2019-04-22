package com.company;
//Класс пользователей. Используемый для получения пароля и логина пользователя.
//Данный класс использован для демонстрации композиции (связи Has a).
public class User  {
    private String login;
    private String password;
    //Демонстрация агрегации (свлязи Has a)
    private Role role = new Role();

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String setLogin(String login) {
        return this.login = login;
    }
    //Получение и задание ссылок значений переменным экземпляров класса Role (агрегация)
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
