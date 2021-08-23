package com.example.demo.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Address;
import com.example.demo.repository.JpaAddressRepositoryImpl;
import com.example.demo.service.AddressService;

@RestController
@RequestMapping("/api/addresses")
public class AddressRestController {
	
	@Autowired
	private JpaAddressRepositoryImpl addressRepository;
	
	@RequestMapping(value = "/{zip}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Address> getAddressByZip(@PathVariable("zip") int zip){
		Address address = this.addressRepository.findByZip(zip);
		if(address == null){
			return new ResponseEntity<Address>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Address>(address, HttpStatus.OK);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Collection<Address>> getAddressesList(){
		Collection<Address> addresses = this.addressRepository.findAll();
		if (addresses.isEmpty()) {
			return new ResponseEntity<Collection<Address>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<Address>>(addresses, HttpStatus.OK);
	}
	
	
}
