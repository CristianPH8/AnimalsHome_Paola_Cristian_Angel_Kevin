package utvt.edu.mx.entities;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import utvt.edu.mx.entities.repositore.tb_mascotasRepository;
@SpringBootTest
class tb_mascotasTest {
	@Autowired
	private tb_mascotasRepository tb_mascotasRepository ;
	@Test
	void test() {
		tb_mascotas vet = new tb_mascotas(null,"Jack","29","Canino","F",1L,"Aseo");
		this.tb_mascotasRepository.save(vet);
	}

}