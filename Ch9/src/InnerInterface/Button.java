package InnerInterface;

public class Button {
	OnClickListener listener;
	
	void SetOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	public void touch(OnClickListener listener)
	{
		listener.onClick();
	}

}
