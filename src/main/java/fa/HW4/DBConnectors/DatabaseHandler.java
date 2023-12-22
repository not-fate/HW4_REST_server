package fa.HW4.DBConnectors;

import fa.HW4.Entities.Row;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DatabaseHandler {

    @PersistenceContext
    public EntityManager entityManager;


    public List<Row> load() {
        return entityManager.createQuery("from Row", Row.class).getResultList();
    }

    @Transactional
    public void upload(List<Row> rows) {
        entityManager.createNativeQuery("TRUNCATE TABLE trees").executeUpdate();
        rows.forEach(entityManager::merge);
    }
}
