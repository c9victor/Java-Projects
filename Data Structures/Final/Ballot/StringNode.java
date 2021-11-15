/*
 *  String Node from h09
 */
public class StringNode {
	private String key;			// Name of votred.
	private String value;		// Candidate A or B. 
	private StringNode next;	// Reference to the next node in the hash map.

	public StringNode(String _key, String _value, StringNode _next) {
		key = _key;
		value = _value;
		next = _next;
	}

	public String getKey() {
		return key;
	}

	public void setToken(String _key) {
		key = _key;
	}

	public StringNode getNext() {
		return next;
	}

	public void setNext(StringNode _next) {
		next = _next;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String _value) {
		value = _value;
	}
}
