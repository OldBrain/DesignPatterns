package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ProductMapper {
    Map<Long, Product> hash = new HashMap<>();
    private final Connection connection;
    private PreparedStatement select;
    private PreparedStatement del;
    private PreparedStatement insert;

    public ProductMapper(Connection connection) {
        this.connection = connection;
        try {
            this.select = connection.prepareStatement("select id, title, price from product where id =?");
            this.del = connection.prepareStatement("delete from product  where id =?");
            this.insert = connection.prepareStatement("insert in to product(id, title, price) values (?,?,?)");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Optional<Product> findById(Long id) {
        Product product = hash.get(id);
        if (product != null) {
            return Optional.of(product);
        }
        try {
            select.setLong(1, id);
            ResultSet rs = select.executeQuery();
            if (rs.next()) {
                product = new Product(rs.getLong(1), rs.getString(2), rs.getFloat(3));
                hash.put(id, product);
                return Optional.of(product);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    protected void delete(Product product) {
        Long id = product.getId();
        if (hash.get(id)!= null) {
            hash.remove(id);
        }
        try {
            del.setLong(1, id);
            ResultSet rs = select.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void update(Product product) {

    }

    protected void insert(Product product) {

    }

}
