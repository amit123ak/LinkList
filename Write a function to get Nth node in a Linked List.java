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
  
  public static int  givenNodeDataAtGivenPos(Node head, int index)
  {
      
      if(head==null)
      {
          return -1;
      }
      if(index==1)
      {
          return head.data;
      }
  
      return givenNodeDataAtGivenPos(head.next, index-1);
      
      
    
  }
 
 
 
    public static void main(String[] args) {
         Node head =new Node(10);
         head.next=new Node(20);
         head.next.next=new Node(30);
         head.next.next.next=new Node(40);
         printNode(head);
         
         System.out.println("index of 3");
         int c= givenNodeDataAtGivenPos(head,3);
            System.out.println(c);

         
        
        


     
       
         
         
   
    }
}
