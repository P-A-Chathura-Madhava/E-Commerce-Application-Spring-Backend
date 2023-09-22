package lk.ctech.dao;

import lk.ctech.entity.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends CrudRepository<Product, Integer>{

    public List<Product> findAll(Pageable pageable);
}
