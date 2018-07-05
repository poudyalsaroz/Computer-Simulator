package part1;

public class Register implements RegisterInterface {

	private int value;
	
	public Register() {
		value = 0;
	}
	
	@Override
	public void setValue(int input) {
		value = input;
	}

	@Override
	public int getValue() {
		return value;
	}

}
