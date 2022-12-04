/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenparteuno;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Carvajal-Triviño
 */
class matriz{
    int[][] matrixCont;
    
    void leerMatriz(int contenedor[][],String url){
        try {
            Scanner file = new Scanner(new File(url));
            int fila = 0;
            while(file.hasNextLine()){
                for (int i = 0; i < contenedor.length; i++) {
                    String[] data = file.nextLine().trim().split(",");
                    for (int j = 0; j < data.length; j++) {
                        contenedor[i][j] = Integer.parseInt(data[j]);
                    }
                }
            }
            matrixCont = contenedor;
            System.out.println("La matriz fue leida y almacenada correctamente");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(matriz.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    void guardarmatrix(int matriz[][],String url) throws IOException{
        try{
            FileWriter m = new FileWriter(url, true);
            BufferedWriter mt = new BufferedWriter(m);
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    mt.write(matriz[i][j] + ",");
                }
                mt.newLine();
            }
            mt.flush();
        } catch (IOException e) {
            //exception handling left as an exercise for the reader
        }
    }
    boolean comparar(int matrizA[][]){
        boolean valor = true;
        if(matrizA.length != matrixCont.length || matrizA[0].length != matrixCont[0].length){
            return false;
        }else{
            for (int i = 0; i < matrizA.length; i++) {
                for (int j = 0; j < matrizA[0].length; j++) {
                    if(matrizA[i][j] != matrixCont[i][j]){
                        valor = false;
                        break;
                    }
                }
            }
        }
        if(valor ==true){
            return true;
        }else{
            return false;
        }    
    }
}
public class ParteDos {
    
}
