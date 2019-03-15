public class LinkedList<T>
{
   private Node head; //head of list
   private int size;

   public LinkedList(T item)
   {
      head = new Node(item);
      size = 1;
   }

   //add node at the front of the list
   public void addAtHead(T item)
   {
     Node temp = head;
     head = new Node(item);
     head.next = temp;
     size++;
   }

   //check if list isEmpty
   public boolean isEmpty()
   {
      return size == 0;
   }

   //return the size of the list
   public int getSize()
   {
      return size;
   }

   public String toString()
   {
      Node temp = head;
      String output = "";
      while(temp != null)
      {
         output += (temp.data + ",  ");
         temp = temp.next;
      }
      return output;
   }


   //Linked List Node
   class Node
   {
      T data;
      Node next;

      Node(T data)
      {
         this.data = data;
         next = null;
      }
      Node()
      {
         data = null;
         next = null;
      }
      public T getData()
      {
         return data;
      }
   }

}
