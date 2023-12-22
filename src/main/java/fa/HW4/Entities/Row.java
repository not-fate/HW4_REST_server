package fa.HW4.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="trees")
public class Row {
    @Id
    public int id;

    public int parent_id;
}