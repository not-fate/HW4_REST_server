package fa.HW4.Controllers;

import fa.HW4.DBConnectors.DatabaseHandler;
import fa.HW4.Entities.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/trees")
public class Controller {

    @Autowired
    public DatabaseHandler databaseHandler;

    @GetMapping
    public List<Row> get() {
        return databaseHandler.load();
    }

    @PostMapping
    public String post(@RequestBody ArrayList<Row> rows) {
        databaseHandler.upload(rows);
        return databaseHandler.getClass().descriptorString();
    }
}