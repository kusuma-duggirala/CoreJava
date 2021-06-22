package Encapsulation;

public class PrivateClass 
{

	private  int i;
	/*public static void main(String[] args) 
	{
		PrivateClass pr=new PrivateClass();
		System.out.println(pr.getI());//0

	}*/
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}

}
