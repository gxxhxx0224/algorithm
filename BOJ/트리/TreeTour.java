import java.io.*;
import java.util.*;

public class Main {
    static class Node{
        char root;
        Node left;
        Node right;

        public Node(char root){
            this.root=root;
            this.left=null;
            this.right=null;
        }
    }
    static void preorder(Node node){
        if(node==null) return;
        System.out.print(node.root);
        preorder(node.left);
        preorder(node.right);
    }
    static void inorder(Node node){
        if(node==null) return;
        inorder(node.left);
        System.out.print(node.root);
        inorder(node.right);
    }
    static void postorder(Node node){
        if(node==null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.root);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine()); //노드 개수
        Node[] tree=new Node[n+1];

        for(int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char root=st.nextToken().charAt(0);
            char left=st.nextToken().charAt(0);
            char right=st.nextToken().charAt(0);

            if(tree[root-'A']==null){ //부모노드가 아직 생성되지 않은 경우
                tree[root-'A']=new Node(root); //부모노드 생성
            }
            if(left!='.'){ //왼쪽 자식이 존재할 경우
                tree[left-'A']=new Node(left); //왼쪽 자식노드 생성
                tree[root-'A'].left=tree[left-'A']; //부모 노드와 연결
            }
            if(right!='.'){ //오른쪽 자식이 존재할 경우
                tree[right-'A']=new Node(right); //오른쪽 자식노드 생성
                tree[root-'A'].right=tree[right-'A']; //부모 노드와 연결
            }
        }
        //전위순회
        preorder(tree[0]);
        System.out.println();

        //중위순회
        inorder(tree[0]);
        System.out.println();

        //후위순회
        postorder(tree[0]);
        System.out.println();
    }
}
