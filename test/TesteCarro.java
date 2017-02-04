import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCarro {

	@Test
	public void test() {
		Carro car = new Carro("Fiat", 12, 7);
		
		car.acelerar();
		car.frear();
		
		assertEquals(79, car.getVelocidade());
	}

}
