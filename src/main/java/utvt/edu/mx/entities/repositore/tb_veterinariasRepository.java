package utvt.edu.mx.entities.repositore;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import utvt.edu.mx.entities.tb_veterinarias;

public interface tb_veterinariasRepository extends JpaRepository<tb_veterinarias,UUID> {

}
