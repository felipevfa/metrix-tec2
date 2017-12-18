package model;

import org.junit.Test;
import junit.framework.Assert;

import model.MetricSuite;
import model.Measure;

public class MeasureTest {
	
	private Measure TMeasure;
	private MetricSuite TMetricSuite;

	@Test
	public void testgets() {
		TMetricSuite = MetricSuite.RCo;
		TMeasure = new Measure(TMetricSuite, 333.3);
		Assert.assertEquals("Erro ao retornar o nome RCo",MetricSuite.RCo, TMeasure.getMetric());
		Assert.assertEquals("Erro ao retornar o valor de RCo", 333.3, TMeasure.getValue(), 0.0);
		
		TMetricSuite = MetricSuite.SCo;
		TMeasure = new Measure(TMetricSuite, 333.3);
		Assert.assertEquals("Erro ao retornar o nome SCo", MetricSuite.SCo, TMeasure.getMetric());
		Assert.assertEquals("Erro ao retornar o valor de SCo", 333.3, TMeasure.getValue(), 0.0);
		
		TMetricSuite = MetricSuite.HCo;
		TMeasure = new Measure(TMetricSuite, 333.3);
		Assert.assertEquals("Erro ao retornar o nome HCo", MetricSuite.HCo, TMeasure.getMetric());
		Assert.assertEquals("Erro ao retornar o valor de HCo", 333.3, TMeasure.getValue(), 0.0);
		
		TMetricSuite = MetricSuite.NoR;
		TMeasure = new Measure(TMetricSuite, 333.3);
		Assert.assertEquals("Erro ao retornar o nome NoR", MetricSuite.NoR, TMeasure.getMetric());
		Assert.assertEquals("Erro ao retornar o valor de NoR", 333.3, TMeasure.getValue(), 0.0);
		
		TMetricSuite = MetricSuite.NoS;
		TMeasure = new Measure(TMetricSuite, 333.3);
		Assert.assertEquals("Erro ao retornar o nome NoSo", MetricSuite.NoS, TMeasure.getMetric());
		Assert.assertEquals("Erro ao retornar o valor de NoS", 333.3, TMeasure.getValue(), 0.0);
		
		TMetricSuite = MetricSuite.NoH;
		TMeasure = new Measure(TMetricSuite, 333.3);
		Assert.assertEquals("Erro ao retornar o nome NoH", MetricSuite.NoH, TMeasure.getMetric());
		Assert.assertEquals("Erro ao retornar o valor de NoH", 333.3, TMeasure.getValue(), 0.0);
		
		TMetricSuite = MetricSuite.RoTLoC;
		TMeasure = new Measure(TMetricSuite, 333.3);
		Assert.assertEquals("Erro ao retornar o nome RoTLoC", MetricSuite.RoTLoC, TMeasure.getMetric());
		Assert.assertEquals("Erro ao retornar o valor de RoTLoC", 333.3, TMeasure.getValue(), 0.0);
		
		TMetricSuite = MetricSuite.RoCLoC;
		TMeasure = new Measure(TMetricSuite, 333.3);
		Assert.assertEquals("Erro ao retornar o nome RoCLoC", MetricSuite.RoCLoC, TMeasure.getMetric());
		Assert.assertEquals("Erro ao retornar o valor de RoCLoC", 333.3, TMeasure.getValue(), 0.0);
		
		TMetricSuite = MetricSuite.RoFLoC;
		TMeasure = new Measure(TMetricSuite, 333.3);
		Assert.assertEquals("Erro ao retornar o nome RoFLoC", MetricSuite.RoFLoC, TMeasure.getMetric());
		Assert.assertEquals("Erro ao retornar o valor de RoFLoC", 333.3, TMeasure.getValue(), 0.0);
		
		TMetricSuite = MetricSuite.HDoS;
		TMeasure = new Measure(TMetricSuite, 333.3);
		Assert.assertEquals("Erro ao retornar o nome HDoS", MetricSuite.HDoS, TMeasure.getMetric());
		Assert.assertEquals("Erro ao retornar o valor de HDoS", 333.3, TMeasure.getValue(), 0.0);
		
		TMetricSuite = MetricSuite.EHMU;
		TMeasure = new Measure(TMetricSuite, 333.3);
		Assert.assertEquals("Erro ao retornar o nome EHMU", MetricSuite.EHMU, TMeasure.getMetric());
		Assert.assertEquals("Erro ao retornar o valor de EHMU", 333.3, TMeasure.getValue(), 0.0);
		
		TMetricSuite = MetricSuite.NoGH;
		TMeasure = new Measure(TMetricSuite, 333.3);
		Assert.assertEquals("Erro ao retornar o nome NoGH", MetricSuite.NoGH, TMeasure.getMetric());
		Assert.assertEquals("Erro ao retornar o valor de NoGH", 333.3, TMeasure.getValue(), 0.0);
		
		TMetricSuite = MetricSuite.NoEH;
		TMeasure = new Measure(TMetricSuite, 333.3);
		Assert.assertEquals("Erro ao retornar o nome NoEH", MetricSuite.NoEH, TMeasure.getMetric());
		Assert.assertEquals("Erro ao retornar o valor de NoEH", 333.3, TMeasure.getValue(), 0.0);
	}

}