package com.alumne.costpersonal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CostPersonalTest {

	@Test
	void Test3treballadors() {

		float cost;
		Treballador treballadors[] = new Treballador[3];

		treballadors[0] = new Treballador("Treballador1", 0, 600, 10);
		treballadors[1] = new Treballador("Treballador2", 1, 1600, 20);
		treballadors[2] = new Treballador("Treballador3", 2, 600, 30);

		cost = CostPersonal.CalculaCostDelPersonal(treballadors);

		assertEquals(2800, cost, "El cost no coincideix");

		System.out.print(cost);

	}

	@Test
	void Test2treballadors() {

		float cost;
		Treballador treballadors[] = new Treballador[2];

		treballadors[0] = new Treballador("Treballador1", 0, 600, 10);
		treballadors[1] = new Treballador("Treballador2", 1, 1600, 20);

		cost = CostPersonal.CalculaCostDelPersonal(treballadors);

		assertEquals(2200, cost, "El cost no coincideix");

		System.out.print(cost);

	}

	@Test
	void Test1treballador() {

		float cost;
		Treballador treballadors[] = new Treballador[1];

		treballadors[0] = new Treballador("Treballador1", 0, 600, 10);

		cost = CostPersonal.CalculaCostDelPersonal(treballadors);

		assertEquals(600, cost, "El cost no coincideix");

		System.out.print(cost);

	}

	@Test
	void Test0treballadors() {

		float cost;
		Treballador treballadors[] = new Treballador[0];

		cost = CostPersonal.CalculaCostDelPersonal(treballadors);

		assertEquals(0, cost, "El cost no coincideix");

		System.out.print(cost);

	}
}
