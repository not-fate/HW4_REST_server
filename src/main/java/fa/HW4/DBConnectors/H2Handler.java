package fa.HW4.DBConnectors;

import org.springframework.stereotype.Repository;

import java.io.IOException;

@Repository
public class H2Handler extends DatabaseHandler{
    public H2Handler() throws IOException {
        super("/h2.properties");
    }
}
