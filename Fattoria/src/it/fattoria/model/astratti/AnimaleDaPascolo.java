package it.fattoria.model.astratti;


public abstract class AnimaleDaPascolo extends Animale {

	static String tipo = "pascolo";

	public AnimaleDaPascolo(String razza, int numeroZampe, String verso) {
		super(razza, numeroZampe, verso, tipo);
	}

	@Override
	public void muovi() {
	}

	@Override
	public void mangia() {
	}

	@Override
	public void dormi() {
	}

	@Override
	public void mattina() {
		muovi();
		mangia();
		pascola();
	}

	public abstract void pascola();

}
