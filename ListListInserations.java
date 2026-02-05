// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static void  printList(Node head)
    {
        
        Node curr =head;
        while(curr!=null)
        {
            System.out.print(curr.data);
            if(curr.next!=null)
            {
                System.out.print("->");
            }else{
                System.out.print("->null");
            }
            curr=curr.next;
        }
    }
    
    public static Node insertAfter(Node head,int data,int key)
    {
       Node curr =head;
       while(curr!=null)
       {
           
           if(curr.data==key)
           {
               break;
           }
           curr=curr.next;
       }
       if(curr==null)
       {
           System.out.println("key is not found ");
       }else{
           Node newNode =new Node(data);
           
         newNode.next=curr.next;
         curr.next=newNode;
       }
       
       return  head; 
    }
    
    public static Node insertBefore(Node head ,int data, int key)
    {
        
        
           if(head==null)
        {
            System.out.println("list is Empty");
            return head ;
        }
        
        Node curr=head.next;
        Node pre=head;
        if(head.data==key)
        {
            
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        return head;
        }
     
        
        while(curr!=null)
        {
            if(curr.data==key)
            {
                break;
            }
             pre=curr;
            curr=curr.next;
            
        }
        if(curr==null)
        {
            System.out.println("key is not found ");
        }else{
            Node newNode=new Node(data);
            newNode.next=curr;
            pre.next=newNode;
            
        }
        
        return head;
        
        
    }
    public static Node insertLast(Node head,int data)
    {
        Node newNode=new Node(data);

        Node curr=head;
        if(head==null)
        {
            return newNode;
        }
      
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=newNode;
        return head;
        
    }
    public static Node insertAtposition(Node head,int data,int pos)
    {
        Node newNode =new Node(data); 

       
        if(pos<1)
        {
            return head;
        }
        if(pos==1)
        {
           newNode.next=head;
           return newNode;
        }
        Node curr=head;
        for( int i=1;i<pos-1 && curr!=null ;i++)
        {
            curr =curr.next;
        }
        if(curr==null)
        {
            System.out.println("POSITION OS OUT OF RANGE");
            return head;
        }
        newNode.next=curr.next;
        curr.next=newNode;
        
        return head;
    }
    
    public static void main(String[] args) {
        
        Node head=new Node(10);
         head.next =new Node(20);
        head.next.next=new Node(30);
         head.next.next.next=new Node(40);
         printList(head);
         head=insertAfter(head,5,20);
         System.out.println();
         printList(head);
         
       head=  insertBefore(head,2,20);
        System.out.println();
         printList(head);
         
         
          head=  insertLast(head,100);
        System.out.println();
         printList(head);
         
         
         
           head=  insertAtposition(head,300,3);
        System.out.println();
         printList(head);
         
         
         
         


        
        
        
        
        
      
    }
}
