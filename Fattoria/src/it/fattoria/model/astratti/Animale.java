package it.fattoria.model.astratti;


public abstract class Animale {

	private String razza;
	private int numeroZampe;
	private String verso;
	private String tipo;

	public Animale(String razza, int numeroZampe, String verso, String tipo) {
		this.razza = razza;
		this.numeroZampe = numeroZampe;
		this.verso = verso;
		this.tipo = tipo;
	}
	public void descrivi() {
		System.out.println("L'animale è un " + this.razza + ", ha " + this.numeroZampe + " zampe" + ", " + this.verso + ".");
	}

	public void giornata() {
		this.mattina();
		this.pomeriggio();
	}

	public void mattina() {
		muovi();
		mangia();
	}

	private void pomeriggio() {
		muovi();
		dormi();
	}
	public abstract void muovi();
	public abstract void mangia();
	public abstract void dormi();

	@Override
	public String toString() {
		return " " + this.razza;
	}
}
