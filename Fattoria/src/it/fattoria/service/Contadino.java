package it.fattoria.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import it.fattoria.model.astratti.Animale;
import it.fattoria.model.concreti.Cavallo;
import it.fattoria.model.concreti.Maiale;
import it.fattoria.model.concreti.Mucca;
import it.fattoria.model.concreti.Pecora;

public class Contadino {

	public static void stilaResocontoAnimali(List<Animale> lista) {
		String path = "C:\\Users\\Exolab\\Desktop\\resoconto.txt";
		String resoconto = lista.toString();
		try {
			FileUtils.writeByteArrayToFile(new File(path), resoconto.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static List<Animale> radunaAnimali() {
		List<Animale> listaAnimali = new ArrayList<Animale>();
		listaAnimali.add(Contadino.creaCavallo());
		listaAnimali.add(Contadino.creaMucca());
		listaAnimali.add(Contadino.creaPecora());
		listaAnimali.add(Contadino.creaMaiale());
		listaAnimali.add(Contadino.creaMaiale());
		listaAnimali.add(Contadino.creaMaiale());
		listaAnimali.add(Contadino.creaMaiale());
		return listaAnimali;
	}

	private static Maiale creaMaiale() {
		Maiale maiale = new Maiale();
		return maiale;
	}

	private static Mucca creaMucca() {
		Mucca mucca = new Mucca();
		return mucca;
	}

	private static Pecora creaPecora() {
		Pecora pecora = new Pecora();
		return pecora;
	}

	private static Cavallo creaCavallo() {
		Cavallo cavallo = new Cavallo();
		return cavallo;
	}

}
