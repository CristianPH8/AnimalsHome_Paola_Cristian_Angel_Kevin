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
@Table(name = "tb_veterinarias")
public class tb_veterinarias {
	@GeneratedValue(strategy = GenerationType.UUID)
	@Id
	private UUID id_veterinaria;
	private Long clave;
	@Column(nullable = false, length=50)
	private String nombre;
	private Long telefono;
	@Column(nullable = false, length=50)
	private String direccion;
	@Column(nullable = false, length=50)
	private String descripcion;
	private Long activo;
}
