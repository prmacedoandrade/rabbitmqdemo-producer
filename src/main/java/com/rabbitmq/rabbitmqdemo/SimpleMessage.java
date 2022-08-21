package com.rabbitmq.rabbitmqdemo;

import java.io.Serializable;

public class SimpleMessage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5781542639867140273L;
	private String name;
	private String description;

	public SimpleMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
