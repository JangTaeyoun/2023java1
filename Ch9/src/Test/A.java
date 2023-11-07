package Test;

public class A {
	static int memberA = 10;
	
	A(){
		System.out.println("A instance is generated.");
	}
	
	static class B {
		B(){
			System.out.println("B instance is generated.");
		}
	}
	
	static class C {
		C(){
			System.out.println("C instance is generated.");
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
