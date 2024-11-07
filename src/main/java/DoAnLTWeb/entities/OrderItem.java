package DoAnLTWeb.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="OrderItem")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name = "OrderItemID")
    private int orderitemId;
	
    @Column(name="OrderID")
    private int orderId;
    
    
    @Column(name="Quantity")
    private int quantity;
    
    @Column(name="Price")
	private int price;
    
    @OneToMany(mappedBy = "orderItem", cascade = CascadeType.ALL)
    private List<Order> order;
    
    @ManyToOne
	@JoinColumn(name = "itemID", referencedColumnName = "itemID")
	private Menu menu;

}
