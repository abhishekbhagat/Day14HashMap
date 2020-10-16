package com.bridgelabz.problemday14;

public class MyMapNode<K, V> implements INode<K> {
	private K key;
	private V value;
	private MyMapNode<K, V> next;

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public MyMapNode<K, V> getNext() {
		return next;
	}

	public void setNext(INode<K> next) {
		this.next = (MyMapNode<K, V>) next;
	}

	public MyMapNode(K key, V value) {
		super();
		this.key = key;
		this.value = value;
		this.next = null;
	}

}
