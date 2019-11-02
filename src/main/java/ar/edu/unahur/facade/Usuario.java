package ar.edu.unahur.facade;

public class Usuario {
    int ID;
    String cuenta;
    String contrasenia;


    public Usuario(int ID, String cuenta, String contrasenia) {
        this.ID = ID;
        this.cuenta = cuenta;
        this.contrasenia = contrasenia;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }


}
