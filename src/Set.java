
public class Set {

	private LinkedNode head;

	public Set() {

	}

	public void add(int x) {

		if (!exists(x)) {
			LinkedNode newNode = new LinkedNode(x);
			newNode.data = x;
			newNode.next = null;

			if (head == null) {
				head = newNode;
			} else {
				LinkedNode n = head;
				while (n.next != null) {
					n = (LinkedNode) n.next;
				}
				n.next = newNode;
			}
		}
	}
//for testing
//	public void show() {
//
//		LinkedNode node = head;
//		while (node.next != null) {
//
//			System.out.println(node.data);
//			node = (LinkedNode) node.next;
//		}
//		System.out.println(node.data);
//	}

	public void delete(int x) {

	}

	public boolean exists(int x) {

		LinkedNode current = head;

		// loop until finds user input, then return true if found
		while (current != null) {
			if (current.getData() == x)
				return true;
			current = current.getNext();
		}

		return false;
	}

	public String toString() {
		String data = "";

		LinkedNode current = head;

		while (current != null) {
			data += current.getData() + " ";
			current = current.getNext();
		}

		return data;

	}

}
