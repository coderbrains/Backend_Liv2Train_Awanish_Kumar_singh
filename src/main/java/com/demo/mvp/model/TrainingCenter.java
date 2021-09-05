package com.demo.mvp.model;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
public class TrainingCenter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(max = 40, message="center name should not exceed 40!")
	private String centerName;
	
	@Pattern(regexp = "[a-zA-Z0-9][a-zA-Z0-9]{11}", message = "center code should be alphanumeric")
	@Size(min = 12 , max = 12, message="center code should be exactly of 12 length!")
	private String centerCode;
	
	@NotNull(message="Address is mandatory field!")
	@Embedded
	@AttributeOverrides({
		  @AttributeOverride( name = "detailAddress", column = @Column),
		  @AttributeOverride( name = "city", column = @Column),
		  @AttributeOverride( name = "state", column = @Column),
		  @AttributeOverride( name = "pinCode", column = @Column)
		})
	private Address address;
	
	private int studentCapacity;
	
	 @ElementCollection
	private List<String> courses;
	
	private java.util.Date date;
	
	@Email(message= "Email should be valid!!")
	private String contactEmail;
	
	@Pattern(regexp = "(0|91)?[7-9][0-9]{9}", message= "Mobile number should be valid!!")
	private String contactPhone;
	
}
