package fundamentals;

public class StaticDemo {

	static int sno=1000;
	
	static void funA()
	{
		System.out.println("Static Demo");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Directly : "+sno);
funA();
System.out.println("ClassName : "+StaticDemo.sno);
StaticDemo.funA();

StaticDemo st=new StaticDemo();
System.out.println("Object Referece "+st.sno);
st.funA();

StaticDemo st1=null;
System.out.println("Object Referece "+st1.sno);
st1.funA();



	}

}
