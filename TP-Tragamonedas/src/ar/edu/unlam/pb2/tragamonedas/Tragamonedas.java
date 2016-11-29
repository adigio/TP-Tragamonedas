package ar.edu.unlam.pb2.tragamonedas;

public class Tragamonedas {
	
	private Tambor tambor1;
	private Tambor tambor2;
	private Tambor tambor3;
	private	Integer resultado1;
	private Integer resultado2;
	private Integer resultado3;
	private Boolean entregaPremio;
	
	public Tragamonedas(Tambor tambor1, Tambor tambor2, Tambor tambor3){
		this.tambor1 = tambor1;
		this.tambor2 = tambor2;
		this.tambor3 = tambor3;
	}
	
	public void girarTambores(){
		this.resultado1 = this.tambor1.girarTambor();
		this.resultado2 = this.tambor2.girarTambor();
		this.resultado3 = this.tambor3.girarTambor();
	}
	
	public Integer getResultado1(){
		return this.resultado1;
	}
	
	public Integer getResultado2(){
		return this.resultado2;
	}
	
	public Integer getResultado3(){
		return this.resultado3;
	}
	
	public Boolean entregaPremio(){
		if(resultado1 == resultado2 && resultado2 == resultado3){
			entregaPremio = true;
		}else{
			entregaPremio = false;
		}
		return entregaPremio; 
	}

}
