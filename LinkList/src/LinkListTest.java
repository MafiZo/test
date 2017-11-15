import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import org.junit.Test;

public class LinkListTest  {


@Test
	public void testAdd211()
	{
		LinkList l1=new LinkList();
		int len=l1.lenght();
 		l1.Add(10);
 	    assertEquals(len+1,l1.lenght());
 	}

@Test	
	public void testAdd221()
	{
		LinkList l1=new LinkList();
		int len=l1.lenght();
 		l1.Add(10);  l1.Add(20); l1.Add(30);
  	    assertEquals(len+3,l1.lenght());
	}

@Test	
	public void testFind311()
	{
		LinkList l1=new LinkList();
	    assert (!l1.find(10));
	}

@Test	
	public void testFind321()
	{
		LinkList l1=new LinkList();
		l1.Add(10);  l1.Add(20); l1.Add(30);	
 	    assert (l1.find(10));
 	    assert (l1.find(20));
 	    assert (l1.find(30));
 	    assert (! l1.find(40));
	}

@Test	
public void testTrace411()
{
	LinkList l1=new LinkList();
	PrintStream originalOut = System.out;
    OutputStream os = new ByteArrayOutputStream();
	PrintStream ps = new PrintStream(os);
	System.setOut(ps);
	l1.trace();
    assertEquals("", os.toString());
	System.setOut(originalOut);
}
@Test	
public void testTrace421()
{
	LinkList l1=new LinkList();
	l1.Add(10);  l1.Add(20); l1.Add(30); 		PrintStream originalOut = System.out;
    OutputStream os = new ByteArrayOutputStream();
	PrintStream ps = new PrintStream(os);
	System.setOut(ps);
	l1.trace();
    assertEquals("10\t20\t30\t", os.toString());
    System.setOut(originalOut);
}
@Test	
public void testDelete511()
{
	LinkList l1=new LinkList();
	assert (!l1.Delete(50));
}
@Test	
public void testDelete521()
{
	LinkList l1=new LinkList();
	l1.Add(10);
	assert (l1.Delete(10));
         assert (!l1.Delete(20));
   } 
@Test	
    public void testDelete522()
{
	LinkList l1=new LinkList();
	l1.Add(10);  l1.Add(20); l1.Add(30);
	assert (!l1.Delete(50));
    assert (l1.Delete(10));
}
@Test	
public void testDelete531()
{
	LinkList l1=new LinkList();
	l1.Add(10);
         l1.Delete(10);
           assertEquals(0,l1.lenght());
   } 
@Test	
public void testDelete532()
{
	LinkList l1=new LinkList();
	l1.Add(10);
	assert (l1.Delete(10));
	l1.Delete(10);
	PrintStream originalOut = System.out;
OutputStream os = new ByteArrayOutputStream();
	PrintStream ps = new PrintStream(os);
	System.setOut(ps);
		l1.trace();
	assertEquals("",os.toString());
		System.setOut(originalOut);
}

@Test	
public void testDelete541()
{
	LinkList l1=new LinkList();
	l1.Add(10);
	l1.Add(20);
	l1.Add(30);
	l1.Delete(10);
	PrintStream originalOut = System.out;
  OutputStream os = new ByteArrayOutputStream();
	PrintStream ps = new PrintStream(os);
	System.setOut(ps);
	l1.trace();
    assertEquals("20\t30\t",os.toString());
	System.setOut(originalOut);
}

@Test
public void testDelete542()
{
	LinkList l1=new LinkList();
	l1.Add(10);
	l1.Add(20);
	l1.Add(30);
	l1.Delete(10);
	l1.Add(40);
    PrintStream originalOut = System.out;
OutputStream os = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(os);
	System.setOut(ps);
	l1.trace();
assertEquals("20\t30\t40\t",os.toString());
		System.setOut(originalOut);
}

@Test	
public void testDelete551()
{
	LinkList l1=new LinkList();
	l1.Add(10);
	l1.Add(20);
	l1.Add(30);
	l1.Delete(20);
	PrintStream originalOut = System.out;
  OutputStream os = new ByteArrayOutputStream();
	PrintStream ps = new PrintStream(os);
	System.setOut(ps);
	l1.trace();
          assertEquals("10\t30\t",os.toString());
		System.setOut(originalOut);
	}

@Test	
public void testDelete561()
{
	LinkList l1=new LinkList();
	l1.Add(10);
	l1.Add(20);
	l1.Add(30);
	l1.Delete(30);
	PrintStream originalOut = System.out;
  OutputStream os = new ByteArrayOutputStream();
	PrintStream ps = new PrintStream(os);
	System.setOut(ps);
	l1.trace();
    assertEquals("10\t20\t",os.toString());
	System.setOut(originalOut);
}

}// end of class
