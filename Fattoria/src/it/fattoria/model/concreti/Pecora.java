package it.fattoria.model.concreti;

import it.fattoria.model.astratti.AnimaleDaPascolo;

public class Pecora extends AnimaleDaPascolo {

	private static String razza = "Pecora";
	private static int numeroZampe = 4;
	private static String verso = "bela";
	private String mangime;

	public Pecora() {
		super(razza, numeroZampe, verso);
		this.mangime = "erba, fieno e sale";
	}

	@Override
	public void mangia() {
		System.out.println("La pecora mangia " + this.mangime + "tutto il giorno.");
	}

	@Override
	public void dormi() {
		System.out.println("La pecora dorme supina, in gruppo.");

	}

	@Override
	public void pascola() {
		System.out.println("La pecora pascola in gregge.");

	}

	@Override
	public void muovi() {
		System.out.println("La pecora beve e ha paura dei cani");

	}

}
