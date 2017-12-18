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
		Assert.assertEquals("Error returning the name RCo",MetricSuite.RCo, TMeasure.getMetric());
		Assert.assertEquals("Error returning the value of RCo", 333.3, TMeasure.getValue(), 0.0);
		
		TMetricSuite = MetricSuite.SCo;
		TMeasure = new Measure(TMetricSuite, 333.3);
		Assert.assertEquals("Error returning the name SCo", MetricSuite.SCo, TMeasure.getMetric());
		Assert.assertEquals("Error returning the value of SCo", 333.3, TMeasure.getValue(), 0.0);
		
		TMetricSuite = MetricSuite.HCo;
		TMeasure = new Measure(TMetricSuite, 333.3);
		Assert.assertEquals("Error returning the name HCo", MetricSuite.HCo, TMeasure.getMetric());
		Assert.assertEquals("Error returning the value of HCo", 333.3, TMeasure.getValue(), 0.0);
		
		TMetricSuite = MetricSuite.NoR;
		TMeasure = new Measure(TMetricSuite, 333.3);
		Assert.assertEquals("Error returning the name NoR", MetricSuite.NoR, TMeasure.getMetric());
		Assert.assertEquals("Error returning the value of NoR", 333.3, TMeasure.getValue(), 0.0);
		
		TMetricSuite = MetricSuite.NoS;
		TMeasure = new Measure(TMetricSuite, 333.3);
		Assert.assertEquals("Error returning the name NoSo", MetricSuite.NoS, TMeasure.getMetric());
		Assert.assertEquals("Error returning the value of NoS", 333.3, TMeasure.getValue(), 0.0);
		
		TMetricSuite = MetricSuite.NoH;
		TMeasure = new Measure(TMetricSuite, 333.3);
		Assert.assertEquals("Error returning the name NoH", MetricSuite.NoH, TMeasure.getMetric());
		Assert.assertEquals("Error returning the value of NoH", 333.3, TMeasure.getValue(), 0.0);
		
		TMetricSuite = MetricSuite.RoTLoC;
		TMeasure = new Measure(TMetricSuite, 333.3);
		Assert.assertEquals("Error returning the name RoTLoC", MetricSuite.RoTLoC, TMeasure.getMetric());
		Assert.assertEquals("Error returning the value of RoTLoC", 333.3, TMeasure.getValue(), 0.0);
		
		TMetricSuite = MetricSuite.RoCLoC;
		TMeasure = new Measure(TMetricSuite, 333.3);
		Assert.assertEquals("Error returning the name RoCLoC", MetricSuite.RoCLoC, TMeasure.getMetric());
		Assert.assertEquals("Error returning the value of RoCLoC", 333.3, TMeasure.getValue(), 0.0);
		
		TMetricSuite = MetricSuite.RoFLoC;
		TMeasure = new Measure(TMetricSuite, 333.3);
		Assert.assertEquals("Error returning the name RoFLoC", MetricSuite.RoFLoC, TMeasure.getMetric());
		Assert.assertEquals("Error returning the value of RoFLoC", 333.3, TMeasure.getValue(), 0.0);
		
		TMetricSuite = MetricSuite.HDoS;
		TMeasure = new Measure(TMetricSuite, 333.3);
		Assert.assertEquals("Error returning the name HDoS", MetricSuite.HDoS, TMeasure.getMetric());
		Assert.assertEquals("Error returning the value of HDoS", 333.3, TMeasure.getValue(), 0.0);
		
		TMetricSuite = MetricSuite.EHMU;
		TMeasure = new Measure(TMetricSuite, 333.3);
		Assert.assertEquals("Error returning the name EHMU", MetricSuite.EHMU, TMeasure.getMetric());
		Assert.assertEquals("Error returning the value of EHMU", 333.3, TMeasure.getValue(), 0.0);
		
		TMetricSuite = MetricSuite.NoGH;
		TMeasure = new Measure(TMetricSuite, 333.3);
		Assert.assertEquals("Error returning the name NoGH", MetricSuite.NoGH, TMeasure.getMetric());
		Assert.assertEquals("Error returning the value of NoGH", 333.3, TMeasure.getValue(), 0.0);
		
		TMetricSuite = MetricSuite.NoEH;
		TMeasure = new Measure(TMetricSuite, 333.3);
		Assert.assertEquals("Error returning the name NoEH", MetricSuite.NoEH, TMeasure.getMetric());
		Assert.assertEquals("Error returning the value of NoEH", 333.3, TMeasure.getValue(), 0.0);
	}

}
