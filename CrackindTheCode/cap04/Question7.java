package cap04;

class BinaryTreeA {
	int value;
	BinaryTreeA left, right, parent;

	public BinaryTreeA(int value) {
		this.value = value;
	}
}

public class Question7 {
	static boolean aFound;
	static boolean bFound;

	static BinaryTreeA CommonAncParents(BinaryTreeA node1, BinaryTreeA node2) {
		// for each parent look other node's parents
		// runs in n2 in time
		return null;
	}
/*
 * Ugly code, but it is what I've got given the constrains of the problem
 * runs in O(n) time worst case. 
 */
	static BinaryTreeA CommonAncNoParents(BinaryTreeA root, BinaryTreeA nodeA,
			BinaryTreeA nodeB) {
		if (root.equals(nodeA)) {
			aFound = true;
			if (bFound)
				return null;
		}
		if (root.equals(nodeB)) {
			bFound = true;
			if (aFound)
				return null;
		}
		boolean auxA = aFound;
		boolean auxB = bFound;
		BinaryTreeA aux;
		aux = CommonAncNoParents(root.left, nodeA, nodeB);

		if (aFound && bFound) {
			// if both have been founded, check if just passing ancestor up, 
			// or if still looking for the first ancestor
			if (aux == null) {
				// check if this node had not yet found neither elements
				if (!auxA && !auxB) {
					// this is the first ancestor
					return root;
				} else {
					// keep going up
					return null;
				}
			} else {
				// just passing the first ancestor up
				return aux;
			}
		}

		aux = CommonAncNoParents(root.right, nodeA, nodeB);

		if (aFound && bFound) {
			// if both have been founded, check if just passing ancestor up, or
			// if still looking for the first ancestor
			if (aux == null) {
				// check if this node had not yet found neither elements
				if (!auxA && !auxB) {
					// this is the first ancestor
					return root;
				} else {
					// keep going up
					return null;
				}
			} else {
				// just passing the first ancestor up
				return aux;
			}
		}

		return null;
	}

	public static void main(String[] args) {

	}

}
