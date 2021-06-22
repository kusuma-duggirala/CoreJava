package StaticNonStatic;

public class NonStatic {

	String mod;
	//static String mod;

	public static void main(String[] args) 
	{
		NonStatic ns1=new NonStatic();
		NonStatic ns2=new NonStatic();
		NonStatic ns3=new NonStatic();
		
		ns1.mod="A";
		ns2.mod="B";
		ns3.mod="C";
		
		ns1=ns2;
		ns2=ns3;
		ns3=ns1;
		
		System.out.println(ns1.mod);
		System.out.println(ns2.mod);
		System.out.println(ns3.mod);
		
		ns1.mod="XXXX";
		System.out.println(ns1.mod);
		System.out.println(ns2.mod);
		System.out.println(ns3.mod);

	}

}
