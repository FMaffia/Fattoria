package it.fattoria.model.concreti;

import it.fattoria.model.astratti.AnimaleDaStalla;

public class Maiale extends AnimaleDaStalla {

	static String razza = "Maiale";
	static int numeroZampe = 4;
	static String verso = "grugnisce";
	private String mangime;

	public Maiale() {
		super(razza, numeroZampe, verso);
		this.mangime = "Mangime per maiali";
	}


	@Override
	public void mangia() {
		System.out.println("Il maiale mangia " + this.mangime + " tutto il giorno.");
	}

	@Override
	public void dormi() {
		System.out.println("Il maiale dorme sia la mattina che la sera.");

	}

	@Override
	public void muovi() {
		System.out.println("Il maiale vive nella sua stalla.");

	}

}
