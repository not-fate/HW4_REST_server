package fa.HW4.DBConnectors;

import org.springframework.stereotype.Component;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <h3> Сущность записи из таблицы TREES.</h3>
 * Используется в качестве Entity-сущности JPA.
 */

@Entity
@Table(name="trees")
public class Row {
    /**
     * Уникальный идентификатор узла.
     */
    @Id
    public int id;
    /**
     * Уникальный идентификатор родительского узла.
     */
    public int parent_id;

    @Override
    public String toString() {
        return id + " " + parent_id;
    }
}