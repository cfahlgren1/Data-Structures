public class LinkedList<T>
{
   public Node head; //head of list
   public Node tail; //tail of list
   public int size; //size of list

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

   //add node to tail
   public void addAtTail(T item)
   {
      Node node = new Node(item);
      if (head.next == null)
      {
         head.next = node;
         node.prev = head;
      }
      Node temp = head;
      while (temp.next != null)
      {
         temp = temp.next;
      }
      temp.next = node;
      node.prev = temp;
      tail = node;
      size ++;
   }

   //remove head node
   public void removeHead()
   {
      if (head == tail)
      {
         head = null;
         tail = null;
      }
      else
      {
         head = head.next;
         head.prev = null;
      }
      size --;
   }

   //remove tail node
   public void removeTail()
   {
      if (head == tail)
      {
         head = null;
         tail = null;
      }
      else
      {
         tail = tail.prev;
         tail.next = null;
      }
      size --;
   }

   //remove indicated node by removing access/pointers to it
   public void remove(Node node)
   {
      if (node == null)
      {
         return;
      }
      Node temp = head;
      while (temp.next != null)
      {
         if (temp.getData().equals(node.getData()))
         {
            if (node == head)
            {
               this.removeHead();
            }
            if (node == tail)
            {
               this.removeTail();
            }
            else
            {
               if (temp.prev != null)
                  temp.prev.next = temp.next;
               if (temp.next != null)
                  temp.next.prev = temp.prev;
               size --;
            }
         }
         temp = temp.next;

      }
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




}
