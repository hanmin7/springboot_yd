package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Customer {
	@Id
	private Long no;
	@Column(name = "username", length = 100, nullable = false)
	private String name;
	@Transient
	private String phone;
	private String addr;
	
	
}
