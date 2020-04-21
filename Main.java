public class Main
{
	public static void main(String[] args) {
	    LinkedList list=new LinkedList();
	    list.addLast(10,list);
	    list.addLast(20,list);
	    list.addLast(30,list);
         list.addLast(50,list);
	    list.addFront(60,list);
	    list.printLinkedList(list);
	    System.out.println();
	    System.out.println("Size of List: "+list.size);
	    System.out.println(list.head.data);
	    
	
		
	}
}
