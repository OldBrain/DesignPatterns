package repository;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class UnitOfWork {
//    private final ProductMapper productMapper;
    private  ProductMapper productMapper;

    private final List<Product> newProduct = new ArrayList<>();
    private final List<Product> updateProduct = new ArrayList<>();
    private final List<Product> delProduct = new ArrayList<>();

    public UnitOfWork(ProductMapper mapper) {
        this.productMapper = mapper;
    }

    public void registerNew(Product product) {
        this.newProduct.add(product);
    }

    public void registerUpdate(Product product) {
        this.updateProduct.add(product);
    }

    public void registerDelete(Product product) {
        this.delProduct.remove(product);
    }

    public void commit() {
        insert();
        update();
        delete();
        clear();
    }

        private void delete() {
            this.delProduct.forEach(productMapper::delete);
        }

    private void update() {
        this.updateProduct.forEach(productMapper::update);
    }

    private void insert() {
        this.newProduct.forEach(productMapper::insert);
    }

    private void clear() {
        this.newProduct.clear();
        this.updateProduct.clear();
        this.delProduct.clear();
    }
}
