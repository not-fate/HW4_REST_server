package fa.HW4.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trees")
public class Row {
    @Id
    @Column(name = "id")
    public int ID;

    @Column(name = "parent_id")
    public int parentID;
}