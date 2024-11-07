package DoAnLTWeb.entities;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Tables")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TableList implements Serializable{
	 private static final long serialVersionUID = 1L;

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="TableId")
	    private int tableId;

	    @Column(name="Capicity")
	    private int capicity;

	    @Column(name="Status")
	    private int status;

	    @Column(name="TableNumber")
	    private String tableNumber;
	    
	    @OneToOne(mappedBy = "tables", cascade = CascadeType.ALL)
	    private TableReservation tableReservation;



}
