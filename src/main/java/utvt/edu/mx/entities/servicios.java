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
@Table(name = "servicios")
public class servicios {
	@GeneratedValue(strategy = GenerationType.UUID)
	@Id
	private UUID id_servicios;
	@Column(nullable = false, length=50)
	private String clave;
	@Column(nullable = false, length=50)
	private String nombre;
	@Column(nullable = false, length=50)
	private String descripcion;
	@Column(nullable = false, length=50)
	private String precio;
	@Column(nullable = false, length=50)
	private String tipo;
	@Column(nullable = false, length=50)
	private String activo;
	private Long id_veterinaria;
}
