package com.alumne.costpersonal;

/**
 * Classe per a calcular el cost total de les nomines del personal
 * 
 * @author EMILIO
 *
 */
public class CostPersonal {
	// static enum TipusTreballador{
	// DIRECTOR, SUBDIRECTOR, BASE
	// }
	static float CalculaCostDelPersonal(Treballador treballadors[]) {
		float costFinal = 0;
		Treballador treballador;
		for (int i = 0; i < treballadors.length; i++) {
			treballador = treballadors[i];
			if (treballador.getTipusTreballador() == Treballador.DIRECTOR
					|| treballador.getTipusTreballador() == Treballador.SUBDIRECTOR) {
				costFinal += treballador.getNomina();
			} else {
				costFinal += treballador.getNomina() + (treballador.getHoresExtres() * 20);
			}
		}
		return costFinal;
	}

	/*
	 * Calcula el cost d'un treballador a partir de la seva nòmina i suma 20 euros
	 * per hores extra als treballadors tipus base
	 */
	static float CostTreballador(Treballador treballador) {
		if (treballador.getTipusTreballador() == Treballador.DIRECTOR
				|| treballador.getTipusTreballador() == Treballador.SUBDIRECTOR) {
			return treballador.getNomina();
		} else {
			return treballador.getNomina() + (treballador.getHoresExtres() * 20);
		}
	}

	/*
	 * Executa el metode CostTreballador per cada objecte del array treballadors
	 */
	static float CalculaCostDelPersonal2(Treballador treballadors[]) {
		// Versio refactoritzada del mètode anterior
		float costFinal = 0;
		Treballador treballador;
		for (int i = 0; i < treballadors.length; i++) {
			costFinal = costFinal + CostTreballador(treballadors[i]);
		}
		return costFinal;
	}
}