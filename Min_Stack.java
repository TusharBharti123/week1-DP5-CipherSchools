public class Min_Stack {
    class Node{
        int value;
        int min;
        Node next;

        public Node(int value, int min) {

            this.value=value;
            this.min = min;
            next=null;
        }
    }

    Node head;

    public void push(int x){
        if(head==null){
            Node n = new Node(x,x);
            head=n;
        }
        else {
            Node n = new Node(x,Math.min(x,head.min));
            n.next=head;
        }

}

public void pop(){
    if(head!=null){
        head=head.next;
    }
}

public int top(){
    if(head!=null){
        return head.value;
    }
        return -1;

    
}

public int getMin(){
    if(head!=null){
        return head.min;
    }
        return -1;
}


        
    public static void main(String[] args) {

        Min_Stack stack = new Min_Stack();
        stack.push(5);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());

       

        



        
    }
}
