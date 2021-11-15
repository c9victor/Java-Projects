public class GameNode {
	private int key;		    // Current node value
	private int value;		    // Connected node value
	private GameNode next;	// Reference to the next node in the hash map.

	/**
		Constructor: creates an instance of StringNode.
	**/
	public GameNode(int _key, int  _value, GameNode _next) {
		key = _key;
		value = _value;
		next = _next;
	}

	public int getKey() {
		return key;
	}

	public void setToken(int _key) {
		key = _key;
	}

	public GameNode getNext() {
		return next;
	}

	public void setNext(GameNode _next) {
		next = _next;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int _value) {
		value = _value;
	}
}
