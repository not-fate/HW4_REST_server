package fa.HW4;
import fa.HW4.DBConnectors.PostgresHandler;
import fa.HW4.DBConnectors.Row;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/trees")
public class Controller {
    @GetMapping
    public List<Row> get() throws Exception {
        return new PostgresHandler().load();
    }

    @PostMapping
    public void post(@RequestBody ArrayList<Row> rows) throws IOException {
        System.out.println(rows);
        new PostgresHandler().upload(rows);
    }
}