package fa.HW4.DBConnectors;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.IOException;

@Repository
public class PostgresHandler extends DatabaseHandler {
    public PostgresHandler() throws IOException {
        super("/postgres.properties");
    }
}
