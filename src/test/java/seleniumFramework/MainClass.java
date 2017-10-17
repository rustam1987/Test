package seleniumFramework;

import org.testng.TestNG;



public class MainClass {

	public static void main(String[] args) {
		 TestNG testng = new TestNG();
         Class[] classes = new Class[]{ CreateAccountTest.class};
         testng.setTestClasses(classes);
         testng.run();


	}

}
