package ar.edu.unlam.pb2.tragamonedas;

import java.util.Random;

public class Tambor {
	
	private Integer caras;
	
	public Tambor(Integer caras)throws Exception{
		if(caras > 1 && caras <= 12){
			this.caras = caras;
		}
		else{
			throw new Exception("Error: El tambor debe tener mas de una cara");
		}
	}
		
	public Integer getCaras() {
		return caras;
	}

	public Integer girarTambor(){
		Random giroAleatorio = new Random();
		return giroAleatorio.nextInt(this.caras) + 1;
	}
}
	