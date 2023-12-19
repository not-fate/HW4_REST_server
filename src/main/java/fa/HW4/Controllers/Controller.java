package fa.HW4.Controllers;

import fa.HW4.DBConnectors.PostgresHandler;
//import fa.HW4.DBConnectors.Row;
import fa.HW4.Entities.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/trees")
public class Controller {

    @Autowired
    public PostgresHandler postgres;

    @GetMapping
    public List<Row> get() {
        return postgres.load();
    }

    @PostMapping
    public void post(@RequestBody ArrayList<Row> rows) {
        postgres.upload(rows);
    }
}