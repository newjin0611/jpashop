package japshop.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

public class Order {

    @Id @GeneratedValue
    @Column(name="ORDER_ID")
    private Long id;
    private Long member_id;
    private LocalDateTime orderDate;
    private OrderStatus orderStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMember_id() {
        return member_id;
    }

    public void setMember_id(Long member_id) {
        this.member_id = member_id;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
