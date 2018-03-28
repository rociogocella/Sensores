package sensors;

import java.util.Observable;
import java.util.Observer;



public class Mecanico implements Observer{
	 @Override
	    public void update(Observable o, Object arg) {
	    	Auto anterior=(Auto)arg;
	    	Auto nuevo=(Auto)o;
	  
	       System.out.println( "Aceite ---->antes: "+anterior.getNivelAceite()+"---> Ahora : "+ nuevo.getNivelAceite() );
	       System.out.println( "Neumatico ->antes: "+anterior.getPresionNeumatico()+"---> Ahora : "+ nuevo.getPresionNeumatico());
	       System.out.println( "Agua ------>antes: "+anterior.getNivelDelAgua()+"---> Ahora : "+ nuevo.getNivelDelAgua());
	    }
}
