package com.samples.domain;


//hibernate session - physical connection to db
//ORM - object relational mapping -- done by hibernate
//session factory -- states creating a hibernate session and remember
public class Message {

	private int id;
	private String text;
	
	public Message() {}

	public Message(String text) {
		this.text = text;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", text=" + text + "]";
	}

}