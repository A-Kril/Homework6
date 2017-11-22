package ua.spring.dao;

import ua.spring.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductDao extends JpaRepository<Product, UUID> {

}
