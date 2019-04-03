class Node{
	int data;
 	Node next;
}

class LinkedList{
 	Node head;
 	Node tail;

 	boolean isEmpty(){
  		return (head==null);
 	}

 	void addFirst(Node input){
  		if (isEmpty()){
   			head = input;
   			tail = input;
  		}
  		else {
   			input.next = head;
   			head = input;
			}
 	}

	void addLast(Node input){
		if (isEmpty()){	
			head = input;
			tail = input;
		}
		else {
			tail.next = input;
			tail = input;
		}
	}

	void insertAfter(int key,Node input){
  		Node temp = head;
  		do {
   			if (temp.data == key){	
   				input.next = temp.next; 
   				temp.next = input;
   				System.out.println("Insert data is succeed.");
   				break;	
   			}			
   			temp = temp.next;
  		}
  		while (temp!=null);
 	}

 	void insertBefore(int key,Node input){
 		Node temp = head;
 		while (temp != null){
 			if ((temp.data == key)&&(temp == head)){
 				this.addFirst(input);	
 				System.out.println("Insert data is succeed.");
 				break;
 			}
 			else if (temp.next.data == key){
 				input.next = temp.next;	
 				temp.next = input;		
 				System.out.println("Insert data is succeed.");
 				break;
 			}
 			temp = temp.next;
 		}
 	}

 	void removeFirst(){
  		Node temp = head;
  		if (!isEmpty()){
   			if (head == tail){		
    			head = tail = null;		
   			}				
   			else {
			    temp = temp.next;	
			    head = temp;		
			    temp = null;		
   			}
  		}
  		else System.out.println("Data is empty!");
 	}

 	void removeLast(){
  		Node temp = head;
  		if (!isEmpty()){
   			if (tail == head){	
    			head = tail = null;
   			}				
   			else {
    			while (temp.next != tail){
    				temp = temp.next;	
    			}						
    			temp.next = null;		
    			tail = temp;		
    			temp = null;
   			}
  		}
  		else System.out.println("Data is empty!");
 	}

 	void remove(int key){
 		Node temp = head;
 		if (!isEmpty()){
 			while (temp != null){
 				if (temp.next.data == key){
 					temp.next = temp.next.next; 
 					break;	
 				}		
 				else if ((temp.data == key)&&(temp == head)){
 					this.removeFirst();
 					break;	
 				}
 				temp = temp.next;
 			}
 		} else System.out.println("Data is empty!");
 	}

 	void find (int key){
  		int i = 0;
  		boolean found = false;
  		Node temp = head;
  		while (temp != null){
   			if (temp.data == key){
    			found = true;
    			break;
   			}
   			i++;
   			temp = temp.next;
  		}
  		if (found){
   			System.out.println(key+" is found at index "+i);
  		}
  		else System.out.println("Data isn't found");
 	}

 	void printNode(){
  		Node temp;
  		temp = head;
  		while (temp != null){
   			System.out.println(temp.data);
   			temp = temp.next;
  		}
 	}
}