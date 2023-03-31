package com.softech.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long addId;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String postalcode;
	

}
