class Node{
    Node next;
    int data;
    Node (int val)
    {
        this.data=val;
    }
}
class  LinkedList{
    public static void main(String[] args) {
        Node  LinkedLst=new Node(-1);
        Node next=LinkedLst;
    for(int i=1;i<10;i++)
    {
        Node newnode=new Node(i);
        next.next=newnode;
        next=next.next;

    }
    traverse(LinkedLst.next);
    }
    static void traverse(Node head)
    {
        while(head!=null)
        {
            System.out.println(head.data);
            head=head.next;
        }
    }

}