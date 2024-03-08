package utvt.edu.mx.entities;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import utvt.edu.mx.entities.repositore.tb_citasRepository;
@SpringBootTest
class tb_citasTest {
	@Autowired
	private tb_citasRepository tb_citasRepository;
	@Test
	void test() {
		tb_citas vet = new tb_citas(null,"22NDL","19-01-2022","Activo",4l,1L);
		this.tb_citasRepository.save(vet);
		
	}

}
