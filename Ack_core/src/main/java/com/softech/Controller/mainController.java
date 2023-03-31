package com.softech.Controller;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.softech.Entity.adDocuments;
import com.softech.Entity.orderHeader;
import com.softech.Entity.productInfo;
import com.softech.Service.orderService;


@RestController
public class mainController {
	
	static Logger logger=Logger.getLogger(mainController.class);
	@Autowired
	private orderService service;
	
	@PostMapping("/saveOrder")
		public orderHeader saveOrder(@RequestBody orderHeader order) {
		
		    logger.info("calling to addorder method");
			orderHeader addOrder=this.service.addOrder(order);
			
			logger.info("order save successfully......");
			
			adDocuments adDocuments = service.ADdocumentsGenerateAndPersist(order);
			System.out.println(adDocuments);
			return addOrder;
		}
	    
	@PostMapping("/saveProduct")
	    public productInfo saveProduct(@RequestBody productInfo product) {
	    	productInfo addProduct = service.addProduct(product);
			return addProduct;
	    	
	    }
	
	
	
	}


