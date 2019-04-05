package it.fattoria.model.astratti;


public abstract class AnimaleDaStalla extends Animale {

	static String tipo = "stalla";

	public AnimaleDaStalla(String razza, int numeroZampe, String verso) {
		super(razza, numeroZampe, verso, tipo);
	}


}
