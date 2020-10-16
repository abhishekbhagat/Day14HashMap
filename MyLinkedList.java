package com.bridgelabz.problemday14;

import com.bridgelabz.problemday13.Node;

public class MyLinkedList<K> {
	 INode<K> head;
	 INode<K> tail;
	 public MyLinkedList() {
		 this.head=null;
		 this.tail=null;
	 }
	public void append(INode<K> newNode) {
		if (head == null && tail == null) {
			head = newNode;
			tail = newNode;
		} else {
		    tail.setNext(newNode);
			tail = newNode;
		}
	}
	public void remove(K data) {
		INode<K> node=head;
		INode<K> prevNode=null;
		while(node!=null) {
			if(node.getKey().equals(data))
				break;
			prevNode=node;
			node=node.getNext();
		}
		if(prevNode==null) {
			head=head.getNext();
		}
		else
		{
		    prevNode.setNext(node.getNext());
		    node.setNext(null);
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
