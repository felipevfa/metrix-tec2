package metrix;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.junit.Test;
import junit.framework.Assert;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
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
import util.DirExplorer;

public class MetricSuiteExtractorTest {
	
	private File ProjectDir;
	private TypeSolver TTS;
	private CompilationUnit TCU;

	@Test
	private void setEnv() {
		ProjectDir = new File("./test-resource");
	}
	
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
}
