package com.apside.nord.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class Hello implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name=null;
	
	
	public Hello(String name) {
		this.name=name;
	}
}
