class A{
	int i=12;
	void m1() {
		System.out.println("m1-AA");
	}
}
class B extends A{
	int j=1;
	void m2() {
		System.out.println("m1-BB");
	}
}
class C extends B{
	void m3() {
		System.out.println(i);
		System.out.println(j);
		m1();
		m2();
	}
}


public class Main{
	public static void main(String[] args) {
		
		C c=new C();
		c.m3();
	}	
}



