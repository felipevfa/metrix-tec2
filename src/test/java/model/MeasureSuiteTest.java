package model;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import javaslang.collection.Vector;
import junit.framework.Assert;
import junit.framework.TestCase;

import model.MeasureSuite;

public class MeasureSuiteTest extends TestCase {
	
	private MeasureSuite TMeasureSuite;
	private Measure TMeasure, TMeasure2;
	private MetricSuite TMetricSuite, TMetricSuite2;

	
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
		Collection<Measure> TCM1 = TMeasureSuite.getMeasures();
		Collection<Measure> TCM2 = TMeasureSuite.getMeasures();
		Assert.assertEquals("Deu ruim", false, TCM1 == TCM2);
	}

	@Test
	public void testAddMeasure() {
		TMetricSuite = MetricSuite.RCo;
		TMeasure = new Measure(TMetricSuite, 333.3);
		TMeasureSuite.addMeasure(TMeasure);
		Assert.assertEquals("Measure RCo nao adicionada corretamente", true, TMeasureSuite.getMeasures().contains(TMeasure));
		
		TMetricSuite2 = MetricSuite.NoH;
		TMeasure2 = new Measure(TMetricSuite2, 333.3);
		TMeasureSuite.addMeasure(TMeasure2);
		Assert.assertEquals("Measure nao adicionada corretamente", true, TMeasureSuite.getMeasures().contains(TMeasure2));
		
		TMetricSuite2 = MetricSuite.HCo;
		TMeasure2 = new Measure(TMetricSuite2, 333.3);
		Assert.assertEquals("Mudou a tag",false, TMeasureSuite.getMeasures().contains(TMeasure2));
		
	}

}
