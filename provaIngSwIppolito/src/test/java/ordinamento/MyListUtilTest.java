package ordinamento;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {

	static List<Integer> numeri;
	static MyListUtil m ;

	@BeforeClass
	public static void primaDellClasse() {
		// inizializzo la lista con dei numeri
		System.out.println("Prima della classe!!");
		numeri = new ArrayList<Integer>();
		numeri.add(10);
		numeri.add(8);
		numeri.add(12);
		numeri.add(6);
		m = new MyListUtil();
		
		LocalDateTime currentDateAndTime = LocalDateTime.now();
		System.out.println("INIZIO TEST " + currentDateAndTime);

	}
	
	@AfterClass
	public static void dopoLaClasse() {
		LocalDateTime currentDateAndTime = LocalDateTime.now();
		System.out.println("FINE TEST " + currentDateAndTime);
	}
	

	@Before
	public void inizioTest() {
		// ora inizio test
	}

	@Test
	public void testOrdineCrescente() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(6);
		a.add(8);
		a.add(10);
		a.add(12);

		assertEquals(numeri, m.sort(numeri, 0));

	}

	@Test
	public void testOrdineDecrescente() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(12);
		a.add(10);
		a.add(8);
		a.add(6);

		assertEquals(numeri, m.sort(numeri, 1));

	}

}
