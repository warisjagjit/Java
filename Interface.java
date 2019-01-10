package stack;

public class GenericStackofObject <T> {
	private T[] s;
	private int n=0;
	public void genericStackofObject(int capacity)
	{
		arr=new T[capacity];
	}
	public void push(String item )
	{
		if(i > arr.length)
		{
			System.out.println("your stack is full");
			return;
		}
		arr[i++]=item;
	}
	public boolean isEmpty()
	{
		if(i<0)return true;
		else
			return false;
	}
	public String  pop() {
		String temp;
		if(!isEmpty())
			return null;
		temp=arr[i];
		arr[i]=null;
		i--;
		return temp;
	}
}
