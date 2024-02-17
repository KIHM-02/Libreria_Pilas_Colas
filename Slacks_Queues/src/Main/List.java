package Main;

public class List
{
    private Node begin, last;

    public List()
    {
        begin = null;
        last = null;
    }

    private boolean isEmpty()
    {
        if(begin == null)
            return true;
        return false;
    }

    public void push(int data)
    {
        if (isEmpty())
        {
            Node newNode = new Node(data, null);
            begin = newNode;
            last = begin;
            System.out.println("Se ha agregado el primero elemento "+data);
        }
        else
        {
            Node newNode = new Node(data, begin);
            begin = newNode;
            System.out.println("Se ha agregado el elemento "+data);
        }
    }

    public void pop(String type) {
        if (isEmpty()) {
            System.out.println("La "+type+" esta vacia");
            return;
        }

        delete_data(type);
    }

    public void delete_data(String type)
    {
        Node temp;
        int dato;

        switch (type)
        {
            case "stack":
                dato = begin.getData();
                begin = begin.getNext();
                System.out.println("Se ha eliminado el elemento "+dato);
                break;

            case "queue":
                dato = last.getData();
                for (temp = begin; temp.getNext() != last; temp = temp.getNext()){}

                temp.setNext(null);
                System.out.println("Se ha eliminado el elemento "+dato);
                break;
        }
    }

    public void display_data(String type)
    {
          if (isEmpty())
          {
              System.out.println("No hay elementos en la "+type);
          }
          else
          {
              Node temp;
              int iterador = 0;

              for (temp = begin; temp != null; temp = temp.getNext())
              {
                  System.out.println("El elemento "+iterador+" es "+temp.getData());
                  iterador++;
              }
              System.out.println("\n");
          }
    }
}
