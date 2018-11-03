/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traitement;

/**
 *
 * @author NewMedia
 */
public class restaurent {
    private String restau;
	private float note;
public restaurent(){
 
  }
public restaurent(String restau,float note){
  this.restau=restau;
  this.note=note;
     
  }
     public String getrestau(){
        return restau;   
    }
      public float getnote(){
        return note;   
    } 
    
    public void setrestau(String restau) {
		this.restau = restau;
	}
     public void setnote(float note) {
		this.note = note;
	}
	

}
