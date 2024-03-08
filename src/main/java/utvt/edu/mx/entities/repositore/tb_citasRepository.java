package utvt.edu.mx.entities.repositore;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import utvt.edu.mx.entities.tb_citas;

public interface tb_citasRepository extends JpaRepository<tb_citas, UUID> {

}
