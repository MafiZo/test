import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.Test;


public class LinkListTest57 {

	@Test
	public void testDelete571()
	{
		LinkList l1=new LinkList();
		l1.Add(10);
		l1.Add(20);
		l1.Add(30);
		l1.Delete(30);
		l1.Add(40);
		l1.Delete(10);
		l1.Add(50);
		PrintStream originalOut = System.out;
	  OutputStream os = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(os);
		System.setOut(ps);
		l1.trace();
	    assertEquals("20\t40\t50\t",os.toString());
		System.setOut(originalOut);
	}
	@Test
	public void testDelete572()
	{
		LinkList l1=new LinkList();
		l1.Add(10);
		l1.Add(20);
		l1.Add(30);
		l1.Delete(30);
		l1.Add(40);
		l1.Delete(10);
		l1.Add(50);
		l1.Delete(40);
		l1.Delete(20);
		l1.Delete(50);
		PrintStream originalOut = System.out;
	  OutputStream os = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(os);
		System.setOut(ps);
		l1.trace();
	    assertEquals("",os.toString());
	    System.setOut(originalOut);
	    assert (l1.IsEmpty());
	    assertEquals(0,l1.lenght());
	          
	}

}
