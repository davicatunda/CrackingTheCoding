package cap04;

class BinaryTreeP {
	int value;
	BinaryTreeP left, right, parent;

	public BinaryTreeP(int value) {
		this.value = value;
	}
}

public class Question6 {
	static boolean isLeftChild(BinaryTreeP node) {
		if (node.parent == null)
			return false;
		if (node.parent.left.equals(node))
			return true;
		return false;
	}

	static BinaryTreeP nextNode(BinaryTreeP node) {
		if (node == null)
			return null;

		// has right child
		if (node.right != null) {
			if (node.right.left == null) {
				return node.right;
			} else {
				BinaryTreeP aux = node.right;
				while (aux.left != null) {
					aux = aux.left;
				}
				return aux;
			}
		}
		// doesn't have a right child
		if (node.parent == null)
			return null;

		if (isLeftChild(node)) {
			return node.parent;
		} else {
			BinaryTreeP aux = node.parent;
			while (aux != null) {
				if (isLeftChild(aux))
					return aux.parent;
				aux = aux.parent;
			}
			return null;
		}
	}

	public static void main(String[] args) {
		BinaryTreeP root = new BinaryTreeP(7);
		BinaryTreeP l = new BinaryTreeP(3);
		BinaryTreeP ll = new BinaryTreeP(2);
		BinaryTreeP lll = new BinaryTreeP(1);
		BinaryTreeP lr = new BinaryTreeP(5);
		BinaryTreeP lrl = new BinaryTreeP(4);
		BinaryTreeP lrr = new BinaryTreeP(6);
		BinaryTreeP r = new BinaryTreeP(8);
		root.left = l; 
		root.right = r; // ------------7
		l.left = ll; // ------------3/---\8
		l.right = lr; // ---------2/-\5
		l.parent = root; // ----1/--4/-\6
		r.parent = root; 
		ll.left = lll;
		ll.parent = l;
		lll.parent = ll;
		lr.left = lrl;
		lr.right = lrr;
		lr.parent = l;
		lrl.parent = lr;
		lrr.parent = lr;
		BinaryTreeP aux = lll;
		while (aux != null) {
			System.out.println(aux.value);
			aux = nextNode(aux);
		}

	}

}
