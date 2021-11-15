public class GameMap {
  GameNode [] table;	// The array of tables. Each table cell is a pointer to the head node of a linked list.
  int numelements;		// The number of elements actually stored in the table.
  int size;				// The size of the array (or table).

  public GameMap() {
    numelements = 0;
    size = 100;
    table = new GameNode[size];
  }

  public void insert(int key, int value) {
    if (numelements == size) {
      GameNode [] oldTable = table;
      int oldSize = size;
      
      numelements = 0;
      size = 2 * size;
      table = new GameNode[size];
      
        for (int i = 0; i < oldSize; i++) {
		    for (GameNode curr = oldTable[i]; curr != null; curr = curr.getNext())
				insert(curr.getKey(), curr.getValue());
	    }
    }
    //int i = hash(key/*, value*/);
    int i = hash(key, value);
    table[i] = new GameNode(key, value, table[i]);
    numelements++;
  }

  //public GameNode find(int key/*, int value*/) {
  //  int i = hash(key/*, value*/);
  public GameNode find(int key, int value) {
    int i = hash(key, value);
    for (GameNode curr = table[i]; curr != null; curr = curr.getNext())
      if (key == curr.getKey()) return curr;
    return null;
  }

  //private int hash(int k/*, int value*/) {
  private int hash(int k, int value) {
    int h = 0;
    //for (int i = 0; i < k.length(); i++)
    //  h = (h * 2917 + (int) k.charAt(i)) % size;
    //  h = (/*value **/ 2917 + k) % size;
    for (int i = 0; i < k; i++)
      h = (h * 2917 + i) % size;
    return h;
  }
}
