package com.example.projectapi;

public class Userbean {

    private String idUser;
    private String login;
    private String password;
    private String name;
    private String idRole;

    /**
     * No args constructor for use in serialization
     */
    public Userbean() {
    }

    /**
     * @param idUser
     * @param password
     * @param idRole
     * @param name
     * @param login
     */
    public Userbean(String idUser, String login, String password, String name, String idRole) {
        super();
        this.idUser = idUser;
        this.login = login;
        this.password = password;
        this.name = name;
        this.idRole = idRole;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdRole() {
        return idRole;
    }

    public void setIdRole(String idRole) {
        this.idRole = idRole;
    }
}