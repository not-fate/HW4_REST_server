package fa.HW4.DBConnectors;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class PostgresHandler extends DatabaseHandler {
    public PostgresHandler() throws IOException {
        super("/postgres.properties");
    }
}
