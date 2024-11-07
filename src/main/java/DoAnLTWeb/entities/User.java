package DoAnLTWeb.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="UserId")
    private int userId;

    @Column(name="Username",columnDefinition = "nvarchar(50)")
    @NotEmpty(message = "khong duoc bo trong")
    private String username;

    @Column(name="Password",columnDefinition = "nvarchar(50)")
    private String password;

    @Column(name="Name",columnDefinition = "nvarchar(50)")
    private String name;

    @Column(name="Email",columnDefinition = "nvarchar(50)")
    private String email;

    @Column(name="Age")
    private int age;

    @Column(name="Phone",columnDefinition = "nvarchar(50)")
    private String phone;
    
 
    // Mối quan hệ Many-to-One với Role
    @ManyToOne
    @JoinColumn(name="roleId")
    private Role role;
    
    @PrePersist
    public void setDefaultRole() {
        if (this.role == null) {
            this.role = new Role();
            this.role.setRoleId(1); // Gán roleId mặc định là 1
        }
    }
    
    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private List<TableReservation> tableReservation;
}

