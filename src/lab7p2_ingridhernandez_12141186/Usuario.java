/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_ingridhernandez_12141186;

/**
 *
 * @author ADMINISTRADOR1
 */
public class Usuario {
    private String nombreUsuario;
    private int ID;
    private String password;
    private String tipo;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, int ID, String password, String tipo) {
        this.nombreUsuario = nombreUsuario;
        this.ID = ID;
        this.password = password;
        this.tipo = tipo;
    }

    public Usuario(String nombreUsuario, int ID, String password) {
        this.nombreUsuario = nombreUsuario;
        this.ID = ID;
        this.password = password;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombreUsuario=" + nombreUsuario + ", ID=" + ID + ", password=" + password + ", tipo=" + tipo + '}';
    }
    
}
