package com.softech.Entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class orderHeader {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String userName;
	private String userMob;
	private String userEmail;
	private Long purchaseOrderNumber;
	@CreationTimestamp
	private LocalDate purchaseOrderDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ordId")
	private orderItems orderItems;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addId")
	private address address;
	

}
