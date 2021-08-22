package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Address;
import com.example.demo.service.AddressService;

@RestController
@RequestMapping("/api/addresses")
public class AddressRestController {
	
	@Autowired
	private AddressService addressService;
	
	@RequestMapping(value = "/{zip}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Address> getAddressByZip(@PathVariable("zip") int zip){
		return null;
	}
}
