package model;

import java.util.Collection;
import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

import model.MeasureSuite;

public class MeasureSuiteTest extends TestCase {
	
	private MeasureSuite TMeasureSuite;
	private Collection<Measure> TMeasures;
	
	@Before
	public void setUp() throws Exception {
		TMeasureSuite = new MeasureSuite("Classe");
	}
	
	@Test
	public void testgetClassName() {
		Assert.assertEquals("Erro ao retornar o nome da classe", "Classe", TMeasureSuite.getClassName());
	}
	
	@Test
	public void testsetClassName() {
		TMeasureSuite.setClassName("ClasseDiferente");
		Assert.assertEquals("Erro ao alterar o nome da classe", "ClasseDiferente", TMeasureSuite.getClassName());
	}
	
	@Test
	public void testGetMeasures() {
		fail("Not yet implemented");
		
		//chamo essa funçao duas vezes, uma das collections eu edito e comparo com a outra e os dois tem que ser diferentes pra passar no teste, a ediçao em 1 nao pode ser refletida no outro
		//interessante chamar a funçao de novo depois da ediçao
	}

	@Test
	public void testAddMeasure() {
		fail("Not yet implemented");
	}

}
