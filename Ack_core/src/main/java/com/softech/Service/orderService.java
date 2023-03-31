package com.softech.Service;

import com.softech.Entity.adDocuments;
import com.softech.Entity.orderHeader;
import com.softech.Entity.productInfo;
import com.softech.Entity.rdDocuments;

public interface orderService {
	
	public orderHeader addOrder(orderHeader order);
	
	public productInfo addProduct(productInfo product);
	
	public adDocuments ADdocumentsGenerateAndPersist(orderHeader order);
	
	public rdDocuments RDdocumentsGenerateAndPersist(orderHeader order);
}
