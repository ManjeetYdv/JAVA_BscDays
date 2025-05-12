package com.company;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
         this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void InsertAtFirst(int value){                      //Insert At First
        Node node = new Node(value);
        node.next=head;
        head= node;

        if(tail==null){                //when first element is inserted.
            tail=head;
        }
        size++;

    }

    public void InsertAtLast(int value){            //Insert At Last
        Node node = new Node(value);                //advantage of maintaining tail is here this takes 0(1) time
        if(tail==null){
            InsertAtFirst(value);
            return;
        }
        tail.next= node;
        tail = node;
        size++;

//        Node node= new Node(value);                  //this takes linear time
//        Node temp = head;
//
//        while(temp.next!=null){
//            temp=temp.next;
//        }
//        temp.next=node;
//        size++;
    }
    public void insert(int value , int index){         //Insert at index

        if(index==0){
            InsertAtFirst(value);
            return;
        }
        if(index==size){
            InsertAtLast(value);
        }
        if(index>size){
            System.out.println("Index is greater than current size: "+size);
            return;
        }

        Node temp = head;
        for(int i=1 ; i<index ;i++){
            temp=temp.next;
        }

        Node node = new Node(value , temp.next);
        temp.next =node;
        size++;



    }

    public void deleteFirst(){                      //Delete first node
        head = head.next;

        if(head==null){  //When list is null after deletion
            tail=null;
        }
        size--;
    }


    public void deleteLast(){                  //Delete Last Node

        if(size<=1){
            deleteFirst();
            return;
        }
        Node prev = get(size-2);
        prev.next=null;
        tail=prev;
        size--;
    }

    public void deleteNode(int index){        // Delete node with index
        if(index==0){
            deleteFirst();
            return;
        }
        if(index==size-1){
            deleteLast();
            return;

        }
        Node prev= get(index-1);
        prev.next = prev.next.next;
        size--;


    }

    public Node get(int index){                 //Get indexed node

        Node temp = head;
        for(int i=0 ;i<index ;i++){
            temp = temp.next;
        }
        return temp;
    }

    public Node find(int value){              //Get node with value
        Node node=head;

        while(node!=null){
            if(node.value == value){
                return node;
            }
            else{
                node=node.next;
            }
        }
        return null;
    }

    public void display(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.value+" -> " );
            temp =temp.next;
        }
        System.out.println("END");

    }

    public void removeDuplicates(){
            Node node = head;
            if(head==null || head.next==null){
                return;
            }
            while(node.next!=null){
                if(node.value == node.next.value){
                    node.next = node.next.next;
                }
                else{
                    node = node.next;
                }
            }
            tail = node;
            tail.next = null;

    }

    public void removeDuplicates_unsorted(){
        Node ptr1 =head;
        Node ptr2;

        while(ptr1!=null && ptr1.next!=null){
            ptr2 =ptr1;

            while(ptr2.next!=null){
                if(ptr1.value == ptr2.next.value){
                    ptr2.next = ptr2.next.next;
                }
                else{
                    ptr2 = ptr2.next;
                }
            }
            tail = ptr1;
            ptr1 = ptr1.next;
        }

    }

    public LL newll(LL list  ,int value){
        LL newL=  new LL();
        newL.head = list.find(value);
        return newL;
    }

    public static LL merge(LL list1 , LL list2){
        Node p1 = list1.head;
        Node p2 = list2.head;

        LL merged = new LL();
        while(p1!=null && p2!=null){

            if(p1.value<p2.value){
                merged.InsertAtLast(p1.value);
                p1 = p1.next;
            }
           else{
                merged.InsertAtLast(p2.value);
                p2 =p2.next;
            }
        }

        while(p1!=null){
         merged.InsertAtLast(p1.value);
         p1 = p1.next;

        }
        while(p2!=null){
            merged.InsertAtLast(p2.value);
            p2 = p2.next;
        }

        return merged;
    }

    public  void  reverseList(){

        Node prev =null;
        Node curr = head;
        Node next = curr;
        while(curr!=null){
            next = curr.next;
            curr.next =prev;

            prev=curr;
            curr=next;

        }
        head = prev;

    }
public void reverseK_nodes( LL list ,int k){
        Node prev=null;
        Node curr = head;
        Node next=  curr;
        int count=0;

        while(next!=null && count<k){
            next = curr.next;
            curr.next = prev;
            prev= curr;
            curr= next;

        }

        



}
    public static void main(String[] args) {
        LL list = new LL();

        list.InsertAtFirst(4);
        list.InsertAtFirst(3);
        list.InsertAtFirst(2);
        list.InsertAtFirst(1);
        list.InsertAtLast(4);
        list.InsertAtLast(5);
        list.InsertAtLast(5);
        list.InsertAtLast(1);
//        list.removeDuplicates();
        list.removeDuplicates_unsorted();
        list.display();

        list.InsertAtLast(100);
        list.display();
//
//        LL list2 = new LL();
//        list2 = LL.newll(list  , 3);
//        list2.display();

        LL list1 = new LL();
        list1.InsertAtLast(1);
        list1.InsertAtLast(2);
        list1.InsertAtLast(5);
        list1.InsertAtLast(7);

        LL list2 = new LL();
        list2.InsertAtLast(3);
        list2.InsertAtLast(4);
        list2.InsertAtLast(9);

//        LL merged = new LL();
//        merged = LL.merge(list1 , list2);
//        merged.display();


        list1.reverseList();
        list1.display();
    }

}
