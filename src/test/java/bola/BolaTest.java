package bola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import lingkaran.Lingkaran;

class BolaTest {
	private Bola bola;
	
	@BeforeEach
	public void setUp()
	{
		Lingkaran lingkaran = new Lingkaran(30);
		this.bola = new Bola(lingkaran);
	}
	
	@Test
	void testLuasBola() {
		double luasBola = bola.LuasBola();
		assertEquals(11304.0,luasBola);
	}

	@Test
	void testVolumeBola() {
		double volumeBola = bola.VolumeBola();
		assertEquals(113040.0,volumeBola);
	}

}
