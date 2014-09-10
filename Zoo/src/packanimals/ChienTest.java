package packanimals;

import junit.framework.TestCase;

public class ChienTest extends TestCase {
      
	Chien c;
	
	public ChienTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		c = new Chien(1,10);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		c=null;
	}

	public void testManger() {
		c.manger();
	}

	public void testToString() {
		c.toString();
	}

	public void testChien() {
		assertNotNull("Chien créé",c);
	}

}
