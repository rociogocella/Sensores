package sensors;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Main {

    public static void main(String[] args)throws CloneNotSupportedException  {
    	Auto observado=new Auto("abc123",10,10,10);
        Mecanico observador=new Mecanico();
        observado.addObserver(observador);
        System.out.println("------->Patente: "+observado.getPatente());
        System.out.println("CAMBIO ACEITE: ");
        observado.cambiarNivelAceite(200);
        System.out.println("");
        System.out.println("cambio presion NEUMATICO: ");
        observado.cambiarPresionNeumatico(210);
        System.out.println("");
        System.out.println("cambio nivel AGUA: ");
        observado.cambiarNivelAgua(450);
        {
        
    }
    }
    
}

