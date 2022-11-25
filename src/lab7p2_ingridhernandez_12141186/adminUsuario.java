/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_ingridhernandez_12141186;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMINISTRADOR1
 */
public class adminUsuario {
    private ArrayList<Usuario> usu =new ArrayList();
    private File archivo = null;

    public adminUsuario() {
    }
     public adminUsuario(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getusu() {
        return usu;
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setusu (ArrayList<Usuario> listaPersonas) {
        this.usu = listaPersonas;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminUsuario{" + "usu=" + usu + ", archivo=" + archivo + '}';
    }
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);

            for (Usuario lu : usu) {
                bw.write(lu.getNombreUsuario() + "|");
                bw.write(lu.getID() + "|");
                bw.write(lu.getPassword() + "|");
                bw.write(lu.getTipo() + "|");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }//Fin Escribir Archivo

    public void leerArchivo() throws IOException {
        Scanner lea = null;
        usu = new ArrayList();
        if (archivo.exists()) {
            try {
                lea = new Scanner(archivo);
                lea.useDelimiter("|");
                while (lea.hasNext()) {
                    usu.add(new Usuario(lea.next(),lea.nextInt(), lea.next(), lea.next()));
                }
            } catch (Exception e) {
            }
            lea.close();
        }
    }//Fin Leer/Cargar archivo
}
