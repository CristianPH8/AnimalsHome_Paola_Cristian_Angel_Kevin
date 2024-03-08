package utvt.edu.mx.entities;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import utvt.edu.mx.entities.repositore.serviciosRepository;
@SpringBootTest
class serviciosTest {
	@Autowired
	private serviciosRepository serviciosRepository;
	@Test
	void test() {
		servicios vet = new servicios(null,"22NL","Baño","Se baño","280","C","Activo",2L);
		this.serviciosRepository.save(vet);
	}

}
