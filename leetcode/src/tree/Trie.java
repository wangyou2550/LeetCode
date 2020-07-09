package tree;

public class Trie {
    private class Node{
        Node[]childs=new Node[26];
        boolean isLeaf;
    }
    private Node root=new Node();
    public Trie(){}
    public void insert(String word){
        insert(word, root);
    }
    private void insert(String word,Node node){
        if(node==null)return ;
        if(word.length()==0){
            node.isLeaf=true;
            return;
        }
        int index=indexForChar(word.charAt(0));
        if(node.childs[index]==null){
            node.childs[index]=new Node();
        }
        insert(word.substring(1),node.childs[index]);
    }

    private int indexForChar(char c) {
        return c-'a';
    }

    public boolean search(String word){
        return search(word,root);
    }
    public boolean search(String word ,Node node){
        if(node==null)return false;
        if(word.length()==0)return node.isLeaf;
        return search(word.substring(1),node.childs[indexForChar(word.charAt(0))]);

    }

}
