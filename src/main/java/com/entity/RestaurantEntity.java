package com.entity;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "restaurants")
@Getter
@Setter
public class RestaurantEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer restaurantId;
	@NotBlank(message = "Please Enter Restaurant Name")
	@Pattern(regexp = "[a-zA-Z]+",message = "Please Enter Valid Restaurant Name")
	String name;
	@NotBlank(message = "Please Enter Restaurant Address")
	String address;
	@NotBlank(message = "Please Enter Restaurant Category")
	@Length(min = 3,max = 20,message = "Please Enter Between 3 to 20 in size")
	String category;
}
