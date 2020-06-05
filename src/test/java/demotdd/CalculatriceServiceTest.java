package demotdd;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatriceServiceTest {
	
	private CalculatriceService calculatriceService;
	
	@Before 
	public void SetUp() {
		calculatriceService = new CalculatriceService();
		System.out.println("On initialise les ressources");
	}
	
	@Test(timeout=10)
	public void TestAddition() {
		System.out.println("Test Addition");
		int resultat = calculatriceService.Addition(3,4);
		int expected = 7;
		assertTrue(" Resultat not ok ",resultat==expected);
		
	}
	
	@Test(expected = ArithmeticException.class,timeout=10)
	public void TestDivisonZeroWithException() {
		System.out.println("Test Division per zero");
		int resultat = calculatriceService.DivisionZero(3);
		int expected = 0;
		assertTrue(" Doit donner comme résultat 0",resultat ==expected);
		
		
		fail(" Not yet implemented");
	}
	
	@After 
	public void TearDown() {
		calculatriceService = null;
		System.out.println("On libère les ressources");
	}

}
