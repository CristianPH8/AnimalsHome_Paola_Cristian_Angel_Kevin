package utvt.edu.mx.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tb_usuario")
public class users {
	@GeneratedValue(strategy = GenerationType.UUID)
	@Id
	private UUID id_usuarios;
	
	@Column(nullable = false, length=50)
	private String name;
	
	@Column(nullable = false, length=50)
	private String ap;
	
	@Column(nullable = false, length=50)
	private String am;
	
	@Column(nullable = false, length=50)
	private String email;
	
	@Column(nullable = false, length=50)
	private String password;
	
	@Column(nullable = false, length=50)
	private String telefono;
	
	@Column(nullable = false, length=50)
	private  String tipo;
	
	@Column(nullable = false, length=50)
	private String foto;
	
	@Column(nullable = false, length=50)
	private String activo;
	
	
	
	
}
