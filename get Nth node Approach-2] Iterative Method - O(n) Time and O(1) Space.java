public static int  givenNodeDataAtGivenPos(Node head, int index)
  {
      
      if(head==null)
      {
          return -1;
      }
      Node curr=head ;
      int count=1;
      while(curr!=null)
      {
          if(count==index)
          {
              return curr.data;
          }
          count++;
          curr=curr.next;
          
      }
      return -1;
    
  }
 
