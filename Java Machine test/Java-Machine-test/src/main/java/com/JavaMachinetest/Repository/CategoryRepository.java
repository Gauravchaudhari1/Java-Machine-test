package com.JavaMachinetest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JavaMachinetest.Entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
	
}
