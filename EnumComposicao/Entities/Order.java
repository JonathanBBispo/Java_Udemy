package EnumComposicao.Entities;

import EnumComposicao.Entities.Enums.OrderStatus;
import java.util.Date;

public class Order {
    private Integer id; 
    private Date moment;
    private OrderStatus status;    

    public Order(){}

    public Order(Integer id,Date moment,OrderStatus status){
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public OrderStatus getStatus() {
        return status;
    }
    
    @Override
    public String toString() {
        return String.format("Order [Id = %d, Moment = %s Status = %s]", id, moment, status);
    }
}
