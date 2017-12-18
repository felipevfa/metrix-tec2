package model;

import org.junit.Test;

import java.util.Iterator;
import junit.framework.Assert;

public class MeasureDatasetTest {
	
	private Measure TMeasure;
	private MetricSuite TMetricSuite;
	
	@Test
	public void testStore() {
		TMetricSuite = MetricSuite.RCo;
		TMeasure = new Measure(TMetricSuite, 333.3);
		MeasureDataset.store("Classe",TMeasure);
		
		Iterator<MeasureSuite> i = MeasureDataset.list().iterator();
		boolean ok = false;
		while(i.hasNext()) {
			ok = i.next().getMeasures().contains(TMeasure);
			if(ok) {
				break;
			}
		}
		Assert.assertEquals("Measure not inserted", true, ok);
	}

}
