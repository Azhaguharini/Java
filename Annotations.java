package Day1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnnotationsDemo {
	@Test
	public void test2() {
		System.out.println("in test method 2");
		
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("in beforeclass method");
	}
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("in afterclass method");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("in before method");
	}
	
	

	@After
	public void tearDown() throws Exception {
		System.out.println("in after method");
	}

	@Test
	public void test1() {
		System.out.println("in test method 1");
		
	}
	
}
