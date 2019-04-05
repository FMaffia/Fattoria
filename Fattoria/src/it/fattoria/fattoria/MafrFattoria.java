package it.fattoria.fattoria;

import java.util.List;
import java.util.stream.Collectors;

import it.fattoria.model.astratti.Animale;
import it.fattoria.model.astratti.AnimaleDaPascolo;
import it.fattoria.model.astratti.AnimaleDaStalla;
import it.fattoria.service.Contadino;

public class MafrFattoria {

	private static List<Animale> animaliFattoria = Contadino.radunaAnimali();
	private static List<Animale> animaliDaStalla;
	private static List<Animale> animaliDaPascolo;

	public static void main(String[] args) {
		separaAnimali(animaliFattoria);
		buongiornoFattoria();
		Contadino.stilaResocontoAnimali(animaliFattoria);
	}

	public static void separaAnimali(List<Animale> listaAnimali) {
		animaliDaStalla = listaAnimali.stream()
		        .filter(a -> a instanceof AnimaleDaStalla)
		        .collect(Collectors.toList());
		animaliDaPascolo = listaAnimali.stream()
		        .filter(a -> a instanceof AnimaleDaPascolo)
		        .collect(Collectors.toList());
	}

	public static void descriviFattoria(List<Animale> listaAnimali) {
		listaAnimali.stream().forEach(a -> a.descrivi());
	}

	public static void buongiornoFattoria() {
		animaliFattoria.stream()
		        .forEach(a -> a.giornata());
	}

}
