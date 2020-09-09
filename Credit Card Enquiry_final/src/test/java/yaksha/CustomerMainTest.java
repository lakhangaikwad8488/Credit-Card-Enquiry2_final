package test.java.yaksha;
import main.java.yaksha.CustomerMain;
import main.java.yaksha.TestUtils;
import main.java.yaksha.Customer;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class CustomerMainTest {

	@Test
	void testDisplay() throws IOException {
		 
		long mobile=989898986;
		Customer c=new Customer(mobile, "Narayan", "Pune", "Wipro","Brazil", 20000);
		//assertEquals(true, c.display());
		TestUtils.yakshaAssert(TestUtils.currentTest(),c.display()==true==true?"true":"false",TestUtils.businessTestFile);

		
 	}
	@Test
	public void testExceptionConditon() throws Exception{

	              TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.boundaryTestFile);

	             

	}

	 

	@Test
	public void testBoundaryCondition() throws Exception {

	              TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.exceptionTestFile);

	}

}
