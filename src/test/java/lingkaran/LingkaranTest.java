package lingkaran;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LingkaranTest {
	@Test
	void testLuas() {
		Lingkaran lingkaran = new Lingkaran(10);
		double LuasLingkaran = lingkaran.Luas();
		assertEquals(314 , LuasLingkaran);
	}

}
