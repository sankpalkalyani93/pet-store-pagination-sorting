package com.example.PetStorePaginationAndSortingDemo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "pet2", path = "pet2")
public interface PetRepository extends JpaRepository<Pet2, Long>{
	
	Page<Pet2> findAll(Pageable pageable);
}

