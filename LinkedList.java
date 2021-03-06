public class LinkedList{
    public Node head;
    public static int size;
    
    public LinkedList(){
        head=null;
        size=0;
    }
    
    public static void addLast(int data, LinkedList list){
        Node newNode = new Node(data);
        newNode.nextNode=null;
        
        if(list.head==null){
            list.head=newNode;
        }
        
        else{
            Node last=list.head;
            while(last.nextNode!=null){
                last=last.nextNode;
            }
            last.nextNode=newNode;
        }
        size++;
     
     
    }
    
    public static void addFront(int data,LinkedList list){
        Node newNode=new Node(data,null);
        if(list.head==null){
            list.head=newNode;
        }
        else{
            Node currentNode=list.head;
            list.head=newNode;
            list.head.nextNode=currentNode;
        }
        size++;
      
    }
    
    public static LinkedList reverseLinkedList(LinkedList list){
        
        if(list.head==null || list.size==1)
        return list;
        
        else{
            Node current=list.head;
            Node previous=null;
            Node forward=null;
            
            while(current.nextNode!=null){
                forward=current.nextNode;
                current.nextNode=previous;
                previous=current;
                current=forward;
            }
            list.head=current;
            list.head.nextNode=previous;
            return list;
        }
    }
    public static void printLinkedList(LinkedList list){
        
        Node curNode=list.head;
        if(curNode==null){
            System.out.println("List is empty!");
        }
        else{
            while(curNode!=null){
                System.out.print(curNode.data+"->");
                curNode=curNode.nextNode;
            }
            if(curNode==null)
            System.out.print("null");
        
        }
        
    }
    
}