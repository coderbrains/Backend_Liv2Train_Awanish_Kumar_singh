package com.demo.mvp.model;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@ToString
@Getter @Setter
public class Address {

	
	String detailAddress;
	
	String city;
	
	String state;
	
	String pinCode;
}
