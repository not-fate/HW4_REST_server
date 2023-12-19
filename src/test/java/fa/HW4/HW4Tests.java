package fa.HW4;

import fa.HW4.DBConnectors.H2Handler;
import fa.HW4.DBConnectors.PostgresHandler;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest("Smoke-тесты, проверяющие возможность соединения с базами данных.")
class HW4Tests {

	@Test
	void contextLoads() {
	}

	@Test
	void postgresConnectionTest() throws IOException {
		assertNotNull(new PostgresHandler().load());
	}
	@Test
	void h2ConnectionTest() throws IOException {
		assertNotNull(new H2Handler().load());
	}

}
