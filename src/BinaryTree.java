//Бинарное дерево
public class BinaryTree {
    public int value;
    Node root;
    public Node addRecursive(Node current, int value){
        if (current == null){
            return new Node(value);
        }
        if (value < current.value){
            current.left = addRecursive(current.left, value);
        }
        else if (value > current.value){
            current.right = addRecursive(current.right, value);
        }
        return current;
    }
    public void add(int value){
        root = addRecursive(root, value);

    }
    private boolean findNodeRec(Node current, int value){
        if (current == null){
            return false;
        }
        if (current.value == value){
            return true;
        }

        return value < current.value
                ? findNodeRec(current.left, value)
                : findNodeRec(current.right, value);
    }

    public boolean checkVal(int value){
        return findNodeRec(root, value);
    }

    private Node DeleteR(Node current, int value){
        if (current == null){
            return null;
        }
        if (current.value == value){
            if (current.left == null && current.right == null){
                return null;
            }
            if (current.right == null){
                return current.left;
            }
            if (current.left == null){
                return current.right;
            }
            int smallV = findSVal(current.right);
            current.value = smallV;
            current.right = DeleteR(current.right, smallV);
            return current;
        }
        if (value < current.value){
            current.left = DeleteR(current.left, value);
            return current;
        }
        current.right = DeleteR(current.right, value);
        return current;
    }

    private int findSVal(Node current){
        if (root.left == null){
            return root.value;
        }
        else{
            return findSVal(current.left);
        }
    }

    public void del(int value){
        root = DeleteR(root, value);
    }

}
