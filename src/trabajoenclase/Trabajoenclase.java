
package trabajoenclase;

import javax.swing.JOptionPane;


//TRABAJO EN CASA, TALLER DE ESTRUCTURA DE DATOS 07-0-04-2018
//TALLER

/**
 *
 * @author USUARIO
 */
public class Trabajoenclase {

 
    public static void main(String[] args) {
      
        int numero1;
        int numero2;
        int menu = 0;
        do{
            menu = Integer.parseInt(JOptionPane.showInputDialog("seleccione la opcion: "
                    +"\n1. suma"
                    +"\n2. resta"
                    +"\n3. multiplicacion"
                    +"\n4. division"
                    +"\n5. potencia"                                            
                    +"\n6. salir"));
            
            switch(menu){
                case 1:
                    numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor N1"));
                    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite Valor N2"));
                    JOptionPane.showMessageDialog(null, "el resultado de la suma es: "+suma(numero1, numero2));
                    break;
                case 2:
                    numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor N1"));
                    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor N1"));
                    JOptionPane.showMessageDialog(null, "el resultado de la resta es: "+resta(numero1, numero2));
                    break;
                case 3: 
                    numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor N1"));
                    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor N1"));
                    JOptionPane.showMessageDialog(null, "el resultado de la multiplicacion es: "+multiplicacion(numero1, numero2));
                    break;
                case 4:
                    numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor N1"));
                    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor N1"));
                    JOptionPane.showMessageDialog(null, "el resultado de la divicion es: "+division(numero1, numero2));
                    break;
                  
               case 5:
                    numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor que quieres potenciar"));
                    
                  JOptionPane.showMessageDialog(null, "el resultado de la potencia es: "+potencia(numero1));
                    break;
             
               case 6:
                    JOptionPane.showMessageDialog(null, "usted selecciono salir.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "usted selecciono una opccion no valida.");
                    break;
            }
            
        }while (menu != 6);
        
    }
    public static int suma (int numero1, int numero2){
     int resultado;
     resultado = numero1 + numero2;
     return resultado;
    }
    public static int resta (int numero1, int numero2){
     int resultado;
     resultado = numero1 - numero2;
     return resultado;
    }
    public static int multiplicacion (int numero1, int numero2){
     int resultado;
     resultado = numero1 * numero2;
     return resultado;
    }
    public static double division (int numero1, int numero2){
     double resultado;
     resultado = numero1 / numero2;
     return resultado;

    }
 
 public static double potencia (int numero1){
     double resultado;
     resultado = numero1 * numero1;
     return resultado;
    }
}



    
    

