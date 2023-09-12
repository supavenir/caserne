package fr.caensup.sio.caserne.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.caensup.sio.caserne.Caserne;
import fr.caensup.sio.caserne.Intervention;
import fr.caensup.sio.caserne.Pompier;
import fr.caensup.sio.caserne.exceptions.EmptyMatriculeException;

class InterventionTest {
	private Intervention inter;

	@BeforeEach
	void setUp() throws Exception {
		Caserne caserne = new Caserne("Pompiers", "CAEN");
		this.inter = new Intervention(LocalDateTime.now());
		this.inter.setCaserne(caserne);
		this.inter.ajouterPompier((new Pompier("AAA")).affecter(caserne));
	}

	void checkInitial() {
		assertNotNull(inter);
		assertEquals(1, inter.getPompiers().size());
	}

	@Test
	void testAjouterPompierDeLaMemeCaserne() throws EmptyMatriculeException {
		checkInitial();
		inter.ajouterPompier(new Pompier("BBB").affecter(inter.getCaserne()));
		assertEquals(2, inter.getPompiers().size());
		assertTrue(inter.getPompiers().contains(new Pompier("BBB")));
	}

	@Test
	void testAjouter2FoisMemePompier() throws EmptyMatriculeException {
		testAjouterPompierDeLaMemeCaserne();
		inter.ajouterPompier(new Pompier("BBB").affecter(inter.getCaserne()));
		assertEquals(2, inter.getPompiers().size());
	}

	@Test
	void testAjouterPompierDuneAutreCaserne() throws EmptyMatriculeException {
		inter.ajouterPompier(new Pompier("CCC").affecter(new Caserne("", "NICE")));
		assertEquals(1, inter.getPompiers().size());

	}
}
