/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocelulas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author javi
 */
public class Matriz {
    
    private boolean[][] matrizVida;

    public Matriz(int x) {
        matrizVida = new boolean[x][x];
    }

    public boolean[][] getMatrizVida() {
        return matrizVida;
    }

    public void setMatrizVida(boolean[][] matrizVida) {
        this.matrizVida = matrizVida;
    }
    
    public int calculoDeCelulasVivas(int porcentaje){
        int dimension=matrizVida.length*matrizVida.length;
        return (dimension * porcentaje)/100;
    }

    public void darVida(){
        Scanner teclado = new Scanner(System.in);
        
       System.out.println("Donde quiere colocar la celula vivas");
                  System.out.println("Inserte el eje x");
                  int x= teclado.nextInt();
                  System.out.println("Inserte el eje y");
                  int y= teclado.nextInt();
                  matrizVida[x][y]=true;    
    }
    
    public void darVidaAleatoriamente(int porcentaje){
        for(int i =0;i<=porcentaje;i++){
        Random rnd = new Random();
        int x= rnd.nextInt(matrizVida.length);
        int y= rnd.nextInt(matrizVida.length);
        matrizVida[x][y]=true;
        }
    }
    
    public void darforma(){
        for(int i=0;i<matrizVida.length;i++){
            for(int j=0;j<matrizVida[i].length;j++){
                 if (matrizVida[i][j]) {
                    System.out.print("|O|");
                } else {
                    System.out.print("|X|");
                }
                 
            }System.out.println("");
        }
    }

    public int[][] verAlrededor(){
        
        int matrizAlrededor[][] = null;
         for(int i=0;i<matrizVida.length;i++){
            for(int j=0;j<matrizVida[i].length;j++){
                if(rededor[i][j]==3 && !matrizVida[i][j]){
                    matrizVida[i][j]=true;
                }else if(rededor[i][j]==3 || rededor[i][j]==2 && matrizVida[i][j]){
                    matrizVida[i][j]=true;
                }else if(rededor[i][j]==1 || rededor[i][j]==0 && matrizVida[i][j]){
                    matrizVida[i][j]=false;
                }else{
                    matrizVida[i][j]=false;
                }
            }
    }
        return matrizVida;
    
}
    
}

