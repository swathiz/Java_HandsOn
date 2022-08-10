package com.samples.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="message")
public class Message {

	@Id
	@Column(name="id")
	// this line is given coz in table id is auto generated, if we dnt want to be kept as auto generated then skip this line
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="text")
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
