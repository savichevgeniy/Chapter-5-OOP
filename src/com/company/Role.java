package com.company;
import static javax.swing.JOptionPane.*;
//Класс роль (Has a). На примере данного класа показана агрегация, т.к. у одого пользователя есть всего
//одна роль.
public class Role{
    private String  roles;

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
