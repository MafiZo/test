
public class LinkList {

	public  Node First;
	public LinkList()
	{
		First=null;
	}
	public int lenght()
	{
		
		Node current;
		if(First==null)
			return 0;
		current=First;
		
		int l=0;
		while(current!=null)
		{current=current.next; l++;}
		
		return l;
	}
	public boolean IsEmpty()
	{
		return(lenght()==0);
	}
	public void Add(int value)
	{
		Node current;
		Node recent=new Node(value);
		current=First;
		if(First==null)
		{
			First=recent;
			return;	
		}
		while(current.next!=null)
		     current=current.next; 
		
		current.next= recent;
	}
	public void trace()
	{
		Node current;
		if(First==null)
			return;
		current=First;
		while(current!=null)
		{
			System.out.print(current.value+"\t");
			current=current.next;	
		}
	}
	public boolean find (int val)
	{
		if(First==null)
			return false;
		Node current;
		current=First;
		while(current!=null)
		{
			if (current.value==val)
				return true;
			current=current.next; 
		}
		return false;
	}
	public boolean Delete(int val)
	{
		
		if(First==null)
			return false;
		
		if(First.next==null)
			if (val==First.value)
			{
				First=null;
				return true;
			}
		else
			if (val!=First.value)
			{
				return false;
			}	
		if (val==First.value)
		{
			First=First.next;
			return true;
		}
		Node current;
		Node previous=First;
		current=First.next;
		while(current!=null)
		{
			if (current.value==val)
			{
				previous.next=current.next;
				return true;
			}
				
			previous=current;
			current=current.next; 
		}
		
		return false;
	}
}
