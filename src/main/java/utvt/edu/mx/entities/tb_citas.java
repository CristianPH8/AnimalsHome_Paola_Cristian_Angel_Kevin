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
@Table(name = "tb_citas")
public class tb_citas {
	@GeneratedValue(strategy = GenerationType.UUID)
	@Id
	private UUID id_cita;
	@Column(nullable = false, length=50)
	private String folio;
	@Column(nullable = false, length=50)
	private String fecha;
	@Column(nullable = false, length=50)
	private String estatus;
	@Column(nullable = false, length=50)	
	private Long id_mascota;
	private Long id_servicio;
	
	
	
}
