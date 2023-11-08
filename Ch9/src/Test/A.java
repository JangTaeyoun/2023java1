package Test;

public class A {
	int field1 = 10;
	static int field2 = 20;
	B b = new B();
	C c = new C();
	//static B b1 = new B();
	static C c1 = new C();
	
	void method1() {
		B b = new B();
		C c = new C();
	}
	static void method2() {
		//B b = new B();
		C c = new C();
	}

static int memberA = 10;
	
	A(){
		System.out.println("A instance is generated.");
	}
	
	class B {
		void method() {
			field1 = 30;
			method1();
			field2 = 40;
			method2();
		}
	}
			
		B(){
			System.out.println("B instance is generated.");
		}
	}
	
	static class C {
		void method() {
			//field1 = 30;
			//method1();
			field2 = 40;
			method2();
		}
	}
	void method1() {
		class D {
			D(){
				System.out.println("D instance is generated.");
			}
		}
		D d = new D();
	}
	
	void method2() {
		//D d = new D();
	}

}
