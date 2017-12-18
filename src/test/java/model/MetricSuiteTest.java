package model;

import org.junit.Test;
import junit.framework.Assert;
import model.MetricSuite;

public class MetricSuiteTest {
	
	public MetricSuite TMetricSuite;

	@Test
	public void testgetName() {
		TMetricSuite = MetricSuite.RCo;
		Assert.assertEquals("Error returning the name RCo", "RCo", TMetricSuite.getName());
		
		TMetricSuite = MetricSuite.SCo;
		Assert.assertEquals("Error returning the name SCo", "SCo", TMetricSuite.getName());
		
		TMetricSuite = MetricSuite.HCo;
		Assert.assertEquals("Error returning the name HCo", "HCo", TMetricSuite.getName());
		
		TMetricSuite = MetricSuite.NoR;
		Assert.assertEquals("Error returning the name NoR", "NoR", TMetricSuite.getName());
		
		TMetricSuite = MetricSuite.NoS;
		Assert.assertEquals("Error returning the name NoS", "NoS", TMetricSuite.getName());
		
		TMetricSuite = MetricSuite.NoH;
		Assert.assertEquals("Error returning the name NoH", "NoH", TMetricSuite.getName());
		
		TMetricSuite = MetricSuite.RoTLoC;
		Assert.assertEquals("Error returning the name RoTLoC", "RoTLoC", TMetricSuite.getName());
		
		TMetricSuite = MetricSuite.RoCLoC;
		Assert.assertEquals("Error returning the name RoCLoC", "RoCLoC", TMetricSuite.getName());
		
		TMetricSuite = MetricSuite.RoFLoC;
		Assert.assertEquals("Error returning the name RoFLoC", "RoFLoC", TMetricSuite.getName());
		
		TMetricSuite = MetricSuite.HDoS;
		Assert.assertEquals("Error returning the name HDoS", "HDoS", TMetricSuite.getName());
		
		TMetricSuite = MetricSuite.EHMU;
		Assert.assertEquals("Error returning the name EHMU", "EHMU", TMetricSuite.getName());
		
		TMetricSuite = MetricSuite.NoGH;
		Assert.assertEquals("Error returning the name NoGH", "NoGH", TMetricSuite.getName());
		
		TMetricSuite = MetricSuite.NoEH;
		Assert.assertEquals("Error returning the name NoEH", "NoEH", TMetricSuite.getName());
	}

}
