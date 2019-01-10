package stack;

public class ResizeofStack {
	private String arr[];
	private int i=0;
	public void StackofStrings(int capacity)
	{
		arr=new String[capacity];
	}
	public void push(String item )
	{
		if(i > arr.length)
			resize(2 * arr.length);
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
		if(i>0 && i == arr.length / 4)
			resize(arr.length / 2);
		return temp;
	}
	private void resize(int  capacity)
	{
		String copy[]=new String[capacity];
		for(int i=0;i<i;i++)
		{
			copy[i]=arr[i];
		}
		arr=copy;
	}
}
