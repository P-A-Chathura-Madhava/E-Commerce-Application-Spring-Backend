package lk.ctech.dao;

import lk.ctech.entity.OrderDetail;
import lk.ctech.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderDetailDao extends CrudRepository<OrderDetail, Integer> {

    public List<OrderDetail> findByUser(User user);
    public List<OrderDetail> findByOrderStatus(String status);

}