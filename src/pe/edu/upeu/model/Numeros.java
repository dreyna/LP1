/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.model;

/**
 *
 * @author alum.fial1
 */
public class Numeros {
    private int []numeros;

    public Numeros(int[] numeros) {
        for(int i=0;i<numeros.length;i++){
            this.numeros[i]= numeros[i];
        }
    }
        public int maximo(){
        int max=0;
            for (int i = 0; i < numeros.length; i++) {
                if(numeros[i]>max){
                    max  = numeros[i];
                }
            }  
        return max;
        }
        public int minimo(){
        int minimo=1000;
            for (int i = 0; i < numeros.length; i++) {
                if(numeros[i]<minimo){
                    minimo  = numeros[i];
                }
            }  
        return minimo;
        }
        public int par(){
        int npar=0;
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i]%2==0) {
                    npar++;
                }
            }
        return npar;
        }
        public int impar(){
        int ipar=0;
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i]%2!=0) {
                    ipar++;
                }
            }
        return ipar;
        }
        public double promedio(){
        double prom;int sum=0;
            for (int i = 0; i < numeros.length; i++) {
                sum = sum + numeros[i];
            }
            prom = (double)sum/numeros.length;
                   
        return prom;
        }
        public int sumaC(){
        int sum=0;
            for (int i = 0; i < numeros.length; i++) {
                sum = sum + numeros[i]*numeros[i];
            }
            
                   
        return sum;
        }
    }
    
    

