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
public class adminSeleccion {
    private ArrayList<seleccion> sel =new ArrayList();
    private File archivo = null;

    public adminSeleccion() {
    }
     public adminSeleccion(String path) {
        archivo = new File(path);
    }

    public ArrayList<seleccion> getsel() {
        return sel;
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setsel(ArrayList<seleccion> listaPersonas) {
        this.sel= listaPersonas;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminSeleccion{" + "sel=" + sel + ", archivo=" + archivo + '}';
    }
     public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);

            for (seleccion s : sel) {
                bw.write(s. getNombre() + "|");
                bw.write(s.getJugados() + "|");
                bw.write(s.getGanados() + "|");
                bw.write(s.getEmpatados() + "|");
                bw.write(s.getPerdidos() + "|");
                bw.write(s.getFavor() + "|");
                bw.write(s.getContra( )+ "|");
                bw.write(s.getDiferencia() + "|");
                bw.write(s.puntos(s)+ "|");
               
                for (Jugador j : s.getJ()) {
                    bw.write(j.getNombre()+":");
                }
                
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }//Fin Escribir Archivo

    public void leerArchivo() throws IOException {
        Scanner lea = null;
        sel = new ArrayList();
        if (archivo.exists()) {
            try {
                lea = new Scanner(archivo);
                lea.useDelimiter("(;|\\||\\[|\\]|,)");
                while (lea.hasNext()) {
                   sel.add(new seleccion(lea.next(),lea.nextInt(),lea.nextInt(), lea.nextInt(),lea.nextInt(),lea.nextInt(),lea.nextInt(),lea.nextInt()));
                if(!lea.hasNext("") && !lea.hasNext("")){
                    System.out.println("Hay doble vacio");
                    
                while (!lea.hasNext("")) {
                            int indexPersonas =sel.size() - 1;
                            sel.get(indexPersonas).getJ().add(new Jugador(lea.next()));
                        }
                    } else {
                        lea.next();
                        
                    }
                }
                
            } catch (Exception e) {
            }
            lea.close();
        }
    }//Fin Leer/Cargar archivo
}
