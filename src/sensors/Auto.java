package sensors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Observable;

/**
 *
 * @author usuario
 */
public class Auto extends Observable implements Cloneable{
   private String patente;
   private int nivelAceite;
   private int presionNeumatico;
   private int nivelDelAgua;
   
   public Auto() {
			}
  


public Auto(String patente, int nivelAceite, int presionNeumatico, int nivelDelAgua) {
	super();
	this.patente = patente;
	this.nivelAceite = nivelAceite;
	this.presionNeumatico = presionNeumatico;
	this.nivelDelAgua = nivelDelAgua;
}



public void cambiarNivelAceite(int nivel) throws CloneNotSupportedException {
	 
		Auto  obj1=(Auto)this.clone();
       this.nivelAceite=nivel;
       //marcamos el obj observable  como objeto q ha cambiado
       setChanged();
       //notificamos a los observadores
       notifyObservers(obj1);  
  
       
   }

   public void cambiarPresionNeumatico(int presion) throws CloneNotSupportedException {
	   
	   Auto  obj1=(Auto)this.clone();
       this.presionNeumatico=presion;
       //marcamos el obj observable  como objeto q ha cambiado
       setChanged();
       //notificamos a los observadores
       notifyObservers(obj1);
      
  
       
   }
  public void cambiarNivelAgua(int nivel) throws CloneNotSupportedException {
	   
	  Auto  obj1=(Auto)this.clone();
       this.nivelDelAgua=nivel;
       //marcamos el obj observable  como objeto q ha cambiado
       setChanged();
       //notificamos a los observadores
       notifyObservers(obj1);
      
  
       
   }

	
	
	public String getPatente() {
	return patente;
}



	public int getNivelAceite() {
		return nivelAceite;
	}
	public void setNivelAceite(int nivelAceite) {
		this.nivelAceite = nivelAceite;
	}
	
	
	public int getPresionNeumatico() {
		return presionNeumatico;
	}
	public void setPresionNeumatico(int presionNeumatico) {
		this.presionNeumatico = presionNeumatico;
	}
	
	public int getNivelDelAgua() {
		return nivelDelAgua;
	}



	public void setNivelDelAgua(int nivelDelAgua) {
		this.nivelDelAgua = nivelDelAgua;
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
    
   
   
}
