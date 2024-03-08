package utvt.edu.mx.entities;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import utvt.edu.mx.entities.repositore.usersRepository;
@SpringBootTest
class usersTest {
	@Autowired
	private usersRepository usersRepository;
	@Test
	void test() {
		users user = new users(null,"Margarita","Hurtado","Estrada","al2054@gmail.com","Rojo","752516124","2P","Lope.jps","3P");	
		this.usersRepository.save(user);
	}

}
