package metrix;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.junit.Test;
import junit.framework.Assert;
import junit.framework.TestCase;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.symbolsolver.javaparsermodel.JavaParserFacade;
import com.github.javaparser.symbolsolver.model.resolution.TypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.CombinedTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.JavaParserTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.MemoryTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.ReflectionTypeSolver;

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
import model.MeasureDataset;
import util.DirExplorer;

public class MetricSuiteExtractorTest extends TestCase {
	
	private File ProjectDir;
	private TypeSolver TTS;
	private CompilationUnit TCU;
	private StringBuffer buffer;

	private void RCo() {
		try {
			TCU.accept(new RCoExtractor(), JavaParserFacade.get(TTS));
		}
		catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	private void HCo() {
		try {
			TCU.accept(new HCoExtractor(), JavaParserFacade.get(TTS));
		}
		catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	private void SCo() {
		try {
			TCU.accept(new SCoExtractor(), JavaParserFacade.get(TTS));
		}
		catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	private void NoR() {
		try {
			TCU.accept(new NoRExtractor(), JavaParserFacade.get(TTS));
		}
		catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	private void NoH() {
		try {
			TCU.accept(new NoHExtractor(), JavaParserFacade.get(TTS));
		}
		catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	private void NoS() {
		try {
			TCU.accept(new NoSExtractor(), JavaParserFacade.get(TTS));
		}
		catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	private void NoGH() {
		try {
			TCU.accept(new NoGHExtractor(), JavaParserFacade.get(TTS));
		}
		catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	private void NoEH() {
		try {
			TCU.accept(new NoEHExtractor(), JavaParserFacade.get(TTS));
		}
		catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	private void RoTLoC() {
		try {
			TCU.accept(new RoTLoCExtractor(), JavaParserFacade.get(TTS));
		}
		catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	private void RoCLoC() {
		try {
			TCU.accept(new RoCLoCExtractor(), JavaParserFacade.get(TTS));
		}
		catch (Exception e) {
			fail(e.getMessage());
		}
	}

	private void RoFLoC() {
		try {
			TCU.accept(new RoFLoCExtractor(), JavaParserFacade.get(TTS));
		}
		catch (Exception e) {
			fail(e.getMessage());
		}
	}

	private void HDoS() {
		try {
			TCU.accept(new HDoSExtractor(), JavaParserFacade.get(TTS));
		}
		catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	private void EHMU() {
		try {
			TCU.accept(new EHMUExtractor(), JavaParserFacade.get(TTS));
		}
		catch (Exception e) {
			fail(e.getMessage());
		}
	}


	private void extract() {
		ProjectDir = new File("./src/test/java/resource_test/MyBank");

		new DirExplorer((level, path, file) -> path.endsWith(".java"), (level, path, file) -> {
			try {
				TTS = new CombinedTypeSolver(new JavaParserTypeSolver(ProjectDir), new ReflectionTypeSolver(), new MemoryTypeSolver());
				TCU = JavaParser.parse(new FileInputStream(file));

				RCo();
				HCo();
				SCo();
				NoR();
				NoH();
				NoS();
				NoGH();
				NoEH();
				RoTLoC();
				RoCLoC();
				RoFLoC();
				HDoS();
				EHMU();

			} catch (IOException e) {
				new RuntimeException(e);
			}
		}).explore(ProjectDir);
	}

	@Test
	public void testMain() {
		extract();
		buffer = new StringBuffer("classname,RCo,HCo,SCo,NoR,NoH,NoS,NoGH,NoEH,RoTLoC,RoCLoC,RoFLoC,HDoS,EHMU\n");
		buffer.append("resource_test::MyBank::exception::NegativeAmountException,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,1.0,0.0\n");
		buffer.append("resource_test::MyBank::TaxAccount,2.0,0.0,2.0,2.0,0.0,2.0,0.0,0.0,0.0,0.0,0.0,1.0,1.0\n");
		buffer.append("resource_test::MyBank::SpecialAccount,0.0,1.0,1.0,0.0,0.3333,0.3333,0.0,0.0,0.2222,0.0741,0.0741,0.0,1.0\n");
		buffer.append("resource_test::MyBank::SavingsAccount,0.0,1.0,0.0,0.0,1.0,0.0,0.0,0.0,0.3077,0.1538,0.0,0.0,1.0\n");
		buffer.append("resource_test::MyBank::AbstractAccount,1.0,0.0,2.0,0.25,0.0,0.75,0.0,0.0,0.0,0.0,0.0,1.0,1.0\n");
		buffer.append("resource_test::MyBank::exception::InsufficientFundsException,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,1.0,0.0\n");
		buffer.append("resource_test::MyBank::OrdinaryAccount,2.0,0.0,2.0,2.0,0.0,2.0,0.0,0.0,0.0,0.0,0.0,1.0,1.0");
		
		Assert.assertEquals("Incorrect generated CSV output.", buffer.toString(), MeasureDataset.toCSV());
		
		MeasureDataset.generateCSVFile("testOutput");
	}
}
