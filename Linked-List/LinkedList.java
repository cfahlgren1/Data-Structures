public class LinkedList<T>
{
   public Node head; //head of list
   public int size;

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
     head.next.prev = head;
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
         output += (temp.data + " <==> ");
         temp = temp.next;
      }
      return output;
   }


   //Linked List Node
   class Node
   {
      T data;
      Node next;
      Node prev;

      //create empty node
      Node()
      {
         data = null;
         prev = null;
         next = null;
      }

      //create single node with data
      Node(T data)
      {
         this.data = data;
         next = null;
         prev = null;
      }

      //create node with node previous and next to it
      Node(T data, Node prev, Node next)
      {
         this.prev = prev;
         this.next = next;
         this.data = data;
      }

      //get data from node
      public String toString()
      {
         return data.toString();
      }

   }

}
