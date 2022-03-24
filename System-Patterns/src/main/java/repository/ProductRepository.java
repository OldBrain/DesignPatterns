package repository;

import java.sql.Connection;
import java.util.Collection;
import java.util.Optional;

public class ProductRepository {

    private final Connection connection;

    private final ProductMapper productMapper;

    private UnitOfWork unitOfWork;


    public ProductRepository(Connection connection) {
        this.connection = connection;
        this.productMapper = new ProductMapper(connection);
        this.unitOfWork = new UnitOfWork(productMapper);
    }

    public Optional<Product> findById(Long id) {
        return productMapper.findById(id);
    }

    public void insert(Product product) {
        unitOfWork.registerNew(product);
    }

    public void delete(Product product) {
        unitOfWork.registerDelete(product);
    }

}
