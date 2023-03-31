package com.softech.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softech.Entity.productInfo;

@Repository
public interface productInfoRepo extends JpaRepository<productInfo, Integer>{
	public productInfo findByproductNumber(Long proNumber);

}
