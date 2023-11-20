package ExceptionTest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class c = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		
//		DivideZero d = new DivideZero();
//		try {
//			d.method();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		try {
//			d.method();
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		
		System.out.println("i'm alive.");
	}

}
