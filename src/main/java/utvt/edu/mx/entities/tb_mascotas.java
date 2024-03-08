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
@Table(name = "tb_mascota")
public class tb_mascotas {
	@GeneratedValue(strategy = GenerationType.UUID)
	@Id
	private UUID id_mascota;
	@Column(nullable = false, length=50)
	private String nombre;
	@Column(nullable = false, length=50)
	private String edad;
	@Column(nullable = false, length=50)
	private String raza;
	@Column(nullable = false, length=50)
	private String genero;
	
	private Long id_usuario;
	
	@Column(nullable = false, length=50)
	private String detalles;
	
	
}
