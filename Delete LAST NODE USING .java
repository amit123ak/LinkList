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
  
  public static Node DeleteLastNode(Node head)
  {
      
  
      if(head==null && head.next==null)
      {
          return head;
      }
      Node curr=head;
      while(curr.next.next!=null)
      {
          curr=curr.next;
      }
      curr.next=null;
      
      
      return head;
  }
 
 
 
    public static void main(String[] args) {
         Node head =new Node(10);
         head.next=new Node(20);
         head.next.next=new Node(30);
         head.next.next.next=new Node(40);
         printNode(head);
         
         System.out.println("new");
         head= DeleteLastNode(head);
                  printNode(head);

         
        
        


     
       
         
         
   
    }
}
