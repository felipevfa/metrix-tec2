package metrix;

import org.junit.Test;
import junit.framework.Assert;

import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import metrix.concern.HDoSExtractor;
import metrix.coupling.HCoExtractor;
import metrix.coupling.RCoExtractor;
import metrix.coupling.SCoExtractor;
import metrix.ratio.RoCLoCExtractor;
import metrix.ratio.RoFLoCExtractor;
import metrix.ratio.RoTLoCExtractor;
import metrix.size.NoEHExtractor;
import metrix.size.NoGHExtractor;
import metrix.size.NoHExtractor;
import metrix.size.NoRExtractor;
import metrix.size.NoSExtractor;
import metrix.usage.EHMUExtractor;

public class MetricSuiteExtractorTest {

	@Test
	public void testExtract() {
		Assert.assertEquals(true, new RCoExtractor() instanceof VoidVisitorAdapter);
		Assert.assertEquals(true, new HCoExtractor() instanceof VoidVisitorAdapter);
		Assert.assertEquals(true, new SCoExtractor() instanceof VoidVisitorAdapter);

		Assert.assertEquals(true, new NoRExtractor() instanceof VoidVisitorAdapter);
		Assert.assertEquals(true, new NoHExtractor() instanceof VoidVisitorAdapter);
		Assert.assertEquals(true, new NoSExtractor() instanceof VoidVisitorAdapter);

		Assert.assertEquals(true, new NoGHExtractor() instanceof VoidVisitorAdapter);
		Assert.assertEquals(true, new NoEHExtractor() instanceof VoidVisitorAdapter);
		Assert.assertEquals(true, new HDoSExtractor() instanceof VoidVisitorAdapter);
		Assert.assertEquals(true, new EHMUExtractor() instanceof VoidVisitorAdapter);

		Assert.assertEquals(true, new RoTLoCExtractor() instanceof VoidVisitorAdapter);
		Assert.assertEquals(true, new RoCLoCExtractor() instanceof VoidVisitorAdapter);
		Assert.assertEquals(true, new RoFLoCExtractor() instanceof VoidVisitorAdapter);
	}

}
