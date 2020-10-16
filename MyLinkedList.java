package com.bridgelabz.problemday14;
public class MyLinkedList<K> {
	 INode<K> head;
	 INode<K> tail;
	 public MyLinkedList() {
		 this.head=null;
		 this.tail=null;
	 }
	public void add(INode<K> newNode) {
		if (head == null && tail == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
	}
	public void printMyNode() {
		System.out.println("My Nodes: "+ head);
	}
	public INode<K> search(K data){
		INode<K> temp=head;
		while(temp!=null) {
			if(( temp.getKey()).equals(data))
				return temp;
			temp=temp.getNext();
		}
		return null;
	}
}
