package com.app.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
@Modifying
@Transactional
@Query("update Product p set p.prodCost=:cost where p.prodId=:id")
public int updateCost(double cost, int id);
@Modifying
@Transactional
@Query("delete Product p  where p.prodId=:id")
public int deleteRec( int id);

}
