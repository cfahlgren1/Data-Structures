/**
 * @author Caleb Fahlgren
 * @version 3/15/2019
 * @param <T>
 */
public class Queue<T>
{
   private Node head;
   private Node tail;
   private int size;

   //constructor that initializes queue
   public Queue()
   {
      head = null;
      tail = null;
      size = 0;
   }

   //add node to the tail of queue
   public void enQueue(T data)
   {
      Node node = new Node(data);
      if (head.next == null)
      {
         head = tail = node;
      }
      else
      {
         Node temp = tail;
         temp.next = node;
         node.prev = temp;
      }
      tail = node;
      size ++;
   }

   //remove node from the front of queue
   public void deQueue()
   {
      if (!isEmpty())
      {
         if (head == tail)
         {
            head = tail = null;
         }
         else
         {
            head.next.prev = null;
            head = head.next;
         }
      }
   }

   //check if queue is empty
   public boolean isEmpty()
   {
      return (size == 0);
   }

   //to string method, prints all nodes
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
