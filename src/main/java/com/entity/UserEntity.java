package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name ="users")
@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC) 
//write here diff-diif type of accessLevel and check the symbol and color in ->: window-> show view ->outline
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer userId;
	String firstName;
	String email;
	String password;
	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", firstName=" + firstName + ", email=" + email + ", password="
				+ password + "]";
	}
	
	
}
