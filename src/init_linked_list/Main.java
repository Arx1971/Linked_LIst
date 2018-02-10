package init_linked_list;

public class Main {
	public static void main(String args[]){
		LinkedList myList = new LinkedList();
//		myList.initnode(10);
		myList.addnewNode(100);
		myList.addnewNode(200);
		myList.addnewNode(399);
		myList.addnewNode(400);
		myList.printlist();
		System.out.println("Size of the List: " + myList.listSize());
		if(myList.searchnode(10033)){
			System.out.println("Data Found.");
		}
		else
			System.out.println("Data Not Found.");
		myList.clearlist();
		
		if(myList.isempty()){
			System.out.println("Linked List is Empty.");
		}
		else 
			System.out.println("Linked List is Not empty.");
		
		
		myList.printlist();
		myList.addnewNode(65);
		myList.addnewNode(20);
		myList.addnewNode(39);
		myList.addnewNode(45430);
		myList.printlist();
		if(myList.isempty()){
			System.out.println("Linked List is Empty.");
		}
		else 
			System.out.println("Linked List is Not empty.");
		
		myList.deletepos(3);
		myList.printlist();
		System.out.println("Break: ");
		myList.deletepos(1);
		myList.printlist();
		myList.addnewNode(80);
		myList.addnewNode(232);
		myList.addnewNode(2432);
		myList.addnewNode(4314);
		myList.printlist();
		myList.printmiddle();
		myList.deletepos(5);
		myList.printlist();
		myList.printmiddle();
		myList.head = myList.reverslist(myList.head);
		myList.printlist();
	}
}