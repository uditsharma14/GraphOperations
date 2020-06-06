package com.classes.graph.node;

public class Node<T> {
	
	T value;

	public Node(T value) {
		super();
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

}
