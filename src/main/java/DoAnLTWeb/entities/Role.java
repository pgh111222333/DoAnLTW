package DoAnLTWeb.entities;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="RoleID")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Role implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name = "RoleID")
    private int roleId;
	
	
	@Column(name = "role_name", nullable = false)
    private String roleName;
	
	  // Mối quan hệ One-to-Many với User
	@OneToMany
	@JoinColumn(name="roleId") // Khóa ngoại trỏ đến role_id trong bảng Role
    private Set<User> users;
}
