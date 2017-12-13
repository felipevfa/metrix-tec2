package model;

import org.junit.Test;

import static org.junit.Assert.fail;

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
		Assert.assertEquals("Measure nao inserida", true, ok);
	}
	
//	@Test
//	public void testToCSV() {
//		fail("Not yet implemented");
//	}
//	
//	@Test
//	public void testGenerateCSVFile() {
//		fail("Not yet implemented");
//	}
	

}
