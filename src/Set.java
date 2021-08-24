/* Christopher Chakchay
 * Programming fundamentals
 * Summer 2021
 * Programming Assignment 4 - Set ADT
 */

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

				newNode.next = head;
				head = newNode;

			}
		}
	}

	public LinkedNode delete(int x) {

		LinkedNode current = head;
		LinkedNode prev = null;

		if (current.getData() == x) {
			head = current.next;
			return current;
		}

		while (current != null) {
			if (current.getData() == x) {
				prev.next = current.next;
			}
			prev = current;
			current = current.getNext();

		}
		return current;
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
