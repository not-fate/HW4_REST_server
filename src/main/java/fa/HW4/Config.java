package fa.HW4;

import fa.HW4.DBConnectors.DatabaseHandler;
import fa.HW4.DBConnectors.PostgresHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class Config {

    @Bean
    public DatabaseHandler databaseHandler() throws IOException {
        return new PostgresHandler();
    }

}

