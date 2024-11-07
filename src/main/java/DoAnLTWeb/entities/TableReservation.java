package DoAnLTWeb.entities;

import java.io.Serializable;
import java.sql.Time;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name="TableReservation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TableReservation implements Serializable{

	private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ReservationId")
    private int reservationId;

    @Column(name="Status")
    private int status;
    
    @Column(name="ReservationTime")
    private Time reservationTime;
    
    
    @OneToOne
    @JoinColumn(name = "tableId", referencedColumnName = "tableId")
    private TableList tables;
    
    @OneToOne
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User users;
    
    @OneToMany(mappedBy = "tableReservation", cascade = CascadeType.ALL)
    private List<Order> order;

}
