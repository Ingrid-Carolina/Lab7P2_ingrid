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
public class adminJugador {
    private ArrayList<Jugador> jud =new ArrayList();
    private File archivo = null;

    public adminJugador() {
    }
     public adminJugador(String path) {
        archivo = new File(path);
    }

    public ArrayList<Jugador> getsel() {
        return jud;
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setjud(ArrayList<Jugador> listaPersonas) {
        this.jud= listaPersonas;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminSeleccion{" + "sel=" + jud + ", archivo=" + archivo + '}';
    }
     public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);

            for (Jugador ju : jud) {
                bw.write(ju. getNombre() + "|");
                bw.write(ju.getDorsal() + "|");
                bw.write(ju.getGoles() + "|");
                bw.write(ju.getAsistencia() + "|");
                bw.write(ju.getPartidos()+ "|");
                bw.write(ju.getTarjeta_amarilla() + "|");
                bw.write(ju.getTarjeta_rojas()+ "|");
                bw.write(ju.getFaltas_Cometidas()+ "|");
                bw.write(ju.getFaltas_recibidad()+ "|");
                bw.write(ju.getPosicion()+ "|");
                bw.write(ju.getPorteria_imbatibles()+ "|");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }//Fin Escribir Archivo

    public void leerArchivo() throws IOException {
        Scanner lea = null;
        jud= new ArrayList();
        if (archivo.exists()) {
            try {
                lea = new Scanner(archivo);
                lea.useDelimiter("|");
                while (lea.hasNext()) {
                   jud.add(new Jugador(lea.next(),lea.nextInt(),lea.nextInt(), lea.nextInt(),lea.nextInt(),lea.nextInt(),lea.nextInt(),lea.nextInt(),lea.nextInt(),lea.next(),lea.nextInt(),lea.next()));
                   
                }
            } catch (Exception e) {
            }
            lea.close();
        }
    }//Fin Leer/Cargar archivo
}
