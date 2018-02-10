package init_linked_list;

public class LinkedList {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public void initnode(int newdata){
		head = new Node(newdata);
		head.next = null;
		System.out.println("List Instantiate With: " + newdata);
	}
	
	public void addnewNode(int newData){
		Node myNode = new Node(newData);
		myNode.next = null;
		if(head == null){
			initnode(newData);
			return;
		}
		Node newnode = head;
		while(newnode.next!=null){
			newnode = newnode.next;
		}
		newnode.next = myNode;
		System.out.println("Add " + newData + " into List:");
		return;
	}
	
	public void printlist(){
		Node myNode = head;
		while(myNode!=null){
			System.out.println(myNode.data);
			myNode = myNode.next;
		}
	}
	
	public int listSize(){
		int count = 0;
		Node myNode = head;
		while(myNode!=null){
			count++;
			myNode = myNode.next;
		}
		return count;
	}
	
	public boolean searchnode(int newdata){
		Node myNode = head;
		while(myNode!=null){
			if(myNode.data == newdata)
				return true;
			myNode = myNode.next;
		}
		return false;
	}
	
	public void clearlist(){
		head = null;
	}
	
	public boolean isempty(){
		if(head == null) return true;
		else return false;
	}
	
	public void deletepos(int pos){
		Node myNode = head;
		if(head == null){
			System.out.println("Erorr.");
			return;
		}
		int count = 1;
		while(myNode!=null){
			count++;
			if(pos == 1){
				head = myNode.next;
				return;
			}
			if(count == pos){
				myNode.next = myNode.next.next;
				return;
			}
			myNode = myNode.next;
		}
	}
	
	public void printmiddle(){
		Node fast = head;
		Node slow = head;
		if(head == null) return;
		
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println("Middle : " + slow.data);
	}
	
	public Node reverslist(Node node){
		Node nextnode = null;
		Node prevnode = null;
		Node current = node;
		while(current!=null){
			nextnode = current.next;
			current.next = prevnode;
			prevnode = current;
			current = nextnode;
		}
		node = prevnode;
		return node;
	}
	
}
