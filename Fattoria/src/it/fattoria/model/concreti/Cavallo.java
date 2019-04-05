package it.fattoria.model.concreti;

import it.fattoria.model.astratti.AnimaleDaStalla;

public class Cavallo extends AnimaleDaStalla {

	static String razza = "Cavallo";
	static int numeroZampe = 4;
	static String verso = "nitrisce";
	private String mangime;

	public Cavallo() {
		super(razza, numeroZampe, verso);
		this.mangime = "Mangime per cavalli";
	}


	@Override
	public void mangia() {
		System.out.println("Il cavallo mangia " + this.mangime);
	}

	@Override
	public void dormi() {
		System.out.println("Il cavallo dorme in piedi.");

	}

	@Override
	public void muovi() {
		System.out.println("Il cavallo vive nella stalla.");
	}

}
