package InnerInterface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button b = new Button();
		
		Call c = new Call();
		
		b.SetOnClickListener(c);
		b.touch();

	}

}
