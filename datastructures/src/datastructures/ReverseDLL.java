package datastructures;


class Sol
{

static class Node
{
	int data;
	Node next;
	Node prev;
};

static void reversePrint( Node head_ref)
{
	Node tail = head_ref;


	while (tail.next != null)
	{
		tail = tail.next;
	}

	while (tail != head_ref)
	{
		System.out.print( tail.data + " ");
		tail = tail.prev;
	}
	System.out.println( tail.data );
}


static Node push( Node head_ref, int new_data)
{
	
	Node new_node = new Node();

	
	new_node.data = new_data;

	
	new_node.prev = null;

	
	new_node.next = (head_ref);

	
	if ((head_ref) != null)
		(head_ref).prev = new_node;

	
	(head_ref) = new_node;
	return head_ref;
}

public static void main(String args[])
{

	Node head = null;

	head = push(head, 2);
	head = push(head, 4);
	head = push(head, 8);
	head = push(head, 10);

	System.out.print( "Linked List elements in reverse order : " );

	reversePrint(head);
}
}



