
package excepiones;

import javax.swing.JOptionPane;

public class Rutinas {
    //Programa que recibe solo numeros pares, si ingresa impares mostrara el error 
    public void ejemplo1(){
       int n=Integer.parseInt(JOptionPane.showInputDialog("Digite un valor:  "));
       try {
           if(n%2==0){
               JOptionPane.showMessageDialog(null, "El valor ingresando es par: \n"+n);
            } else {
               throw new Exception("Erro: el numero ingresado es impar: \n" + n);
            }    
        } catch (Exception X) {
    
        }
    }
}
