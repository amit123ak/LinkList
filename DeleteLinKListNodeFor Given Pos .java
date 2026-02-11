// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    
 static class Node {
     
     int data;
     Node next;
     Node(int data)
     {
         this.data=data;
         this.next=null;
     }
 }
 
 
  public static void printNode(Node head)
  {
      
       Node curr=head;
       while(curr!=null)
       {
            System.out.print(curr.data+"->");
             
           curr=curr.next;
       }
       if(curr==null)
       {
           System.out.println("null");
       }
  }
  
  public static Node DeleteNodePos(Node head ,int pos )
  {
       Node curr=head;
       if(head==null ||pos<1)
       {
           return head;
       }
     
       if(pos ==1)
       {
           curr=curr.next;
       
           
           return curr;
           
       }
       Node pre=null;
       for(int i=1;i<pos && curr!=null;i++)
       {
           
           pre=curr;
           curr=curr.next;
          
           
    }
    
       if(curr==null)
    {
        System.out.println("Pos doesn't exists");
        
        return head;
    }
    
    
     pre.next=curr.next;
    
    
 
     return head;
       
  }
 
 
 
    public static void main(String[] args) {
         Node head =new Node(10);
         head.next=new Node(20);
         head.next.next=new Node(30);
         head.next.next.next=new Node(40);
         printNode(head);
         head=DeleteNodePos(head,3);
         System.out.println("");
          printNode(head);
          
        head=DeleteNodePos(head,1);
         System.out.println("");
          printNode(head);
          
          
        head=DeleteNodePos(head,0);
         System.out.println("");
          printNode(head);
          
         head=DeleteNodePos(head,10);
         System.out.println("");
          printNode(head);
          
          head=null;
          
            head=DeleteNodePos(head,10);
         System.out.println("");
          printNode(head);
         
         
         
         
   
    }
}
