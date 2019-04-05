package it.fattoria.model.concreti;

import it.fattoria.model.astratti.AnimaleDaPascolo;

public class Mucca extends AnimaleDaPascolo {

	private static String razza = "Mucca";
	private static int numeroZampe = 4;
	private static String verso = "mugisce";
	private String mangime;

	public Mucca() {
		super(razza, numeroZampe, verso);
		this.mangime = "erba ";
	}

	@Override
	public void mangia() {
		System.out.println("La mucca mangia " + this.mangime);
	}

	@Override
	public void dormi() {
		System.out.println("La mucca dorme accucciata.");

	}

	@Override
	public void pascola() {
		System.out.println("La mucca pascola.");

	}

	@Override
	public void muovi() {
		System.out.println("La mucca mangia erba al sole insieme alle altre mucche.");
	}
}
