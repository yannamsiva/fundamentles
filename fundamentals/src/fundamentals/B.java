package fundamentals;

public class B {

	int i=100;//non-static varibles
	void funA()//non-static method
	{
		System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
B b=new B();
b.funA();

System.out.println(b);//address classname@hashCode
	}

}
