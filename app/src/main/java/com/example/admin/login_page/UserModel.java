package com.example.admin.login_page;

public class UserModel {

    private String fullname;

    private String email_id;

    private String username;

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail_id() {

        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getFullname() {

        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
