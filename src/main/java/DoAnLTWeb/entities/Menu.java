package DoAnLTWeb.entities;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Menu")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Menu implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
    @Column(name = "ItemID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemId;
	
	@Column(name="Type",columnDefinition = "nvarchar(50)")
	@NotEmpty(message = "khong duoc bo trong")
	private String type;

	@Column(name="ItemName",columnDefinition = "nvarchar(50)")
	private String itemName;

	@Column(name="Price")
	private int price;

	@Column(name="Available")
	private int available;
	
	@Column(name="Image",columnDefinition = "nvarchar(500)")
	private String image;
	
	@Column(name="Description",columnDefinition = "nvarchar(500)")
	private String description;
	
    @OneToOne(mappedBy = "menu", cascade = CascadeType.ALL)
    private OrderItem orderItem;

}
