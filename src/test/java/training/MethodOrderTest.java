package training;

import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MethodOrderTest {

	@Test
	public void testA() {
		System.out.println("first");
	}

	@Test
	public void testB() {
		System.out.println("second");
	}

	@Test
	public void testC() {
		System.out.println("third");
	}

}
