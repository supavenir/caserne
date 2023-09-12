package fr.caensup.sio.caserne.tests;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.caensup.sio.caserne.Pompier;
import fr.caensup.sio.caserne.exceptions.EmptyMatriculeException;

class PompierTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testPompierString() {
		assertThrows(EmptyMatriculeException.class, () -> new Pompier(""));
		assertThrows(EmptyMatriculeException.class, () -> new Pompier(null));
		assertDoesNotThrow(() -> new Pompier("AAA"));
	}

	@Test
	void testSetMatricule() throws EmptyMatriculeException {
		new Pompier("MMMM");
	}

	@Test
	void testAffecter() {
		fail("Not yet implemented");
	}

	@Test
	void testAfficherCount() {
		fail("Not yet implemented");
	}

}
