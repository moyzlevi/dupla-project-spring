package com.example.demo.repository;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Address;

@Repository
@Profile("jpa")
public class JpaAddressRepositoryImpl {

    @PersistenceContext
    private EntityManager em;
    
   
    public Address findByZip(int zip) {
        // using 'join fetch' because a single query should load both owners and pets
        // using 'left join fetch' because it might happen that an owner does not have pets yet
        Query query = this.em.createQuery("SELECT address FROM Address address WHERE address.zip =:zip");
        query.setParameter("zip", zip);
        return (Address) query.getSingleResult();
    }
}
