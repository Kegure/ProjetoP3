package com.P3.CinemaProj.usuario;

public class Admin extends Usuario {
    private boolean isAdmin;
    public Admin(String user,String senha) {
        super(user,senha);
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
