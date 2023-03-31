package com.softech.Entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class rdDocuments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String userName;
	private Long purchaseOrderNumber;
	@CreationTimestamp
	private LocalDate documentsCreateDate;
	private String acknowledgementsType;
	
	@OneToOne(cascade = CascadeType.ALL)
	private orderItems orderItems;
	

}
