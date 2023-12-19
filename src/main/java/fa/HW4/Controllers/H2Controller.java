package fa.HW4.Controllers;

import fa.HW4.DBConnectors.H2Handler;
import fa.HW4.Entities.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/h2/trees")
public class H2Controller {

    @Autowired
    public H2Handler h2;

    @GetMapping
    public List<Row> get() {
        return h2.load();
    }

    @PostMapping
    public void post(@RequestBody ArrayList<Row> rows) {
        h2.upload(rows);
    }
}