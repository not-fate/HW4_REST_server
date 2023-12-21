package fa.HW4.DBConnectors;

import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class H2Handler extends DatabaseHandler{
    public H2Handler() throws IOException {
        super("/h2.properties");
    }
}
