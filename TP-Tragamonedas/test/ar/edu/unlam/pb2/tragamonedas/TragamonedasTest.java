package ar.edu.unlam.pb2.tragamonedas;

import org.junit.Assert;
import org.junit.Test;

public class TragamonedasTest {
	
	@Test
	public void queUnTamborDevuelvaUnValorEntreUnoYCantidadDeCaras() throws Exception{
		Integer cantidadDeCaras = 4; 
		Integer valorMinimo = 1;
		Tambor miTambor = new Tambor(cantidadDeCaras);
	
		Assert.assertTrue(miTambor.girarTambor() >= valorMinimo && miTambor.girarTambor()<= cantidadDeCaras);	
	}
	
	@Test
	public void queElTragamonedasNoEntreguePremioSiLosTamboresSonDistintos() throws Exception{
		Tambor miTambor1 = new Tambor(8);
		Tambor miTambor2 = new Tambor(8);
		Tambor miTambor3 = new Tambor(8);
		Tragamonedas miTragamonedas = new Tragamonedas(miTambor1, miTambor2, miTambor3);
		miTragamonedas.girarTambores();

		Assert.assertFalse(miTragamonedas.entregaPremio());
	}
	
	@Test
	public void queElTragamonedasEntreguePremioSiLosTamboresSonIguales() throws Exception{
		Tambor miTambor1 = new Tambor(8);
		Tambor miTambor2 = new Tambor(8);
		Tambor miTambor3 = new Tambor(8);
		Tragamonedas miTragamonedas = new Tragamonedas(miTambor1, miTambor2, miTambor3);
		miTragamonedas.girarTambores();

		Assert.assertTrue(miTragamonedas.entregaPremio());
	}

}
