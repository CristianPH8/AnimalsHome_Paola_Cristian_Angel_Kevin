package utvt.edu.mx.entities;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import utvt.edu.mx.entities.repositore.tb_veterinariasRepository;
@SpringBootTest
class tb_veterinariasTest {
	@Autowired
	private tb_veterinariasRepository tb_veterinariasRepository ;
	@Test
	void test() {
		tb_veterinarias vet = new tb_veterinarias(null,2L,"Towy",7L,"Av.Leon","Por baño",1L);
		this.tb_veterinariasRepository.save(vet);
	}

}
