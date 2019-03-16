/**
 * @author Caleb Fahlgren
 * @version 3/15/2019
 * @param <T>
 */
public class Queue<T>
{
   private Node head; //node that will be dequeued
   private Node tail; //node that was most recently added
   private int size; //number of nodes

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
      if (head == null)
      {
         head = node;
         tail = node;
      }
      else if (head.next == null)
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
         size--;
      }
   }

   //grab head node
   public T peek()
   {
      return (T) head.getData();
   }

   //grab tail node
   public T last()
   {
      return (T) tail.getData();
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
      String output = "[ ";
      while(temp != null)
      {
         output += (temp.data + "  ");
         temp = temp.next;
      }
      return output + " ]";
   }
}
