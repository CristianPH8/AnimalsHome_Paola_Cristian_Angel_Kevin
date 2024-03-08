package utvt.edu.mx.entities.repositore;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import utvt.edu.mx.entities.tb_mascotas;

public interface tb_mascotasRepository extends JpaRepository<tb_mascotas, UUID> {

}
