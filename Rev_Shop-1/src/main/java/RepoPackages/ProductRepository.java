package RepoPackages;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entityclasses.Products;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer> {
    // Custom method to search for products by name (for search feature)
    List<Products> findByProductNameContaining(String productName);
}
