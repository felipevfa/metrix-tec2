package model;

import org.junit.Test;

import junit.framework.Assert;
import model.MetricSuite;

public class MetricSuiteTest {
	
	public MetricSuite TMetricSuite;

	@Test
	public void testgetName() {
		TMetricSuite = MetricSuite.RCo;
		Assert.assertEquals("Erro ao retornar o nome RCo", "RCo", TMetricSuite.getName());
		
		TMetricSuite = MetricSuite.SCo;
		Assert.assertEquals("Erro ao retornar o nome SCo", "SCo", TMetricSuite.getName());
		
		TMetricSuite = MetricSuite.HCo;
		Assert.assertEquals("Erro ao retornar o nome HCo", "HCo", TMetricSuite.getName());
		
		TMetricSuite = MetricSuite.NoR;
		Assert.assertEquals("Erro ao retornar o nome NoR", "NoR", TMetricSuite.getName());
		
		TMetricSuite = MetricSuite.NoS;
		Assert.assertEquals("Erro ao retornar o nome NoS", "NoS", TMetricSuite.getName());
		
		TMetricSuite = MetricSuite.NoH;
		Assert.assertEquals("Erro ao retornar o nome NoH", "NoH", TMetricSuite.getName());
		
		TMetricSuite = MetricSuite.RoTLoC;
		Assert.assertEquals("Erro ao retornar o nome RoTLoC", "RoTLoC", TMetricSuite.getName());
		
		TMetricSuite = MetricSuite.RoCLoC;
		Assert.assertEquals("Erro ao retornar o nome RoCLoC", "RoCLoC", TMetricSuite.getName());
		
		TMetricSuite = MetricSuite.RoFLoC;
		Assert.assertEquals("Erro ao retornar o nome RoFLoC", "RoFLoC", TMetricSuite.getName());
		
		TMetricSuite = MetricSuite.HDoS;
		Assert.assertEquals("Erro ao retornar o nome HDoS", "HDoS", TMetricSuite.getName());
		
		TMetricSuite = MetricSuite.EHMU;
		Assert.assertEquals("Erro ao retornar o nome EHMU", "EHMU", TMetricSuite.getName());
		
		TMetricSuite = MetricSuite.NoGH;
		Assert.assertEquals("Erro ao retornar o nome NoGH", "NoGH", TMetricSuite.getName());
		
		TMetricSuite = MetricSuite.NoEH;
		Assert.assertEquals("Erro ao retornar o nome NoEH", "NoEH", TMetricSuite.getName());
	}

}
