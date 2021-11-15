public class QNode {
	private int dist; 	// This is what the queue will be keyed on.
	private int state;	
	//private int stateY;	//experimental

	public QNode(int _dist, int _state) {
		dist = _dist;
		state = _state;
	}

	/*public QNode(int _dist, int _state, y) {
		dist = _dist;
		state = _state;
        stateY = y;
	}*/

	public QNode(QNode p) {
		dist = p.dist;
		state = p.state;
	}

	public int getDist() {
		return dist;
	}

	public void setDist(int _dist) {
		dist = _dist;
	}

	public int getState() {
		return state;
	}

	public void setState(int _state) {
		state = _state;
	}
    
    /*
	public int getY() {
		return stateY;
	}

	public void setStateY(int _state) {
		stateY = _state;
	}
    */
    
	public int compareTo(QNode p) {
		return dist - p.dist;
	}
}
