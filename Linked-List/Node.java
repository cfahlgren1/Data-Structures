   //Linked List Noded
   class Node<T>
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
      public T getData()
      {
         return data;
      }

      //get data from node
      public String toString()
      {
         return data.toString();
      }

   }