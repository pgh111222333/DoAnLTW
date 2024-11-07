package DoAnLTWeb.entities;

import java.io.Serializable;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="Orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable{

	private static final long serialVersionUID = 1L;
	
	   @Id
	   @Column(name="OrderItemId")
	   private int orderItemId;

	   @Column(name="ReservationId")
	   private int reservationId;

	   @Column(name="OrderTime")
	   private Time orderTime;
	    
	   @Column(name="Total")
	   private int total;
	   
	   @JoinColumn(name = "reservationId", referencedColumnName = "reservationId")
	    private TableReservation tableReservation;
	   
	   @JoinColumn(name = "orderId", referencedColumnName = "orderId")
	    private OrderItem orderItem;
	   
	   

}
