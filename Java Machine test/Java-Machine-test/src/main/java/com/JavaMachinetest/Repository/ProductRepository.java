package com.JavaMachinetest.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.JavaMachinetest.Entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
