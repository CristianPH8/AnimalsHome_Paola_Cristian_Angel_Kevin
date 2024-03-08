package utvt.edu.mx.entities.repositore;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import utvt.edu.mx.entities.servicios;

public interface serviciosRepository extends JpaRepository<servicios, UUID> {

}
