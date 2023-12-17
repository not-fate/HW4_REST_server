package fa.HW4.DBConnectors;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

@Repository
public abstract class DatabaseHandler {
    protected Properties properties = new Properties();
    protected SessionFactory sessionFactory;

    public DatabaseHandler(String path) throws IOException {
        properties.load(getClass().getResourceAsStream(path));
        sessionFactory = new Configuration()
                .addProperties(properties)
                .addAnnotatedClass(Row.class)
                .buildSessionFactory();
    }

    public List<Row> load() {
        try (var session = sessionFactory.openSession()) {
            Query<Row> query = session.createQuery("from Row", Row.class);
            return query.list();
        }
    }

    public void upload(List<Row> rows) {
        try (var session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            try {
                session.createNativeQuery("truncate table TREES").executeUpdate();
                rows.forEach(session::saveOrUpdate);
                transaction.commit();
            } catch (Exception e) {
                if (transaction != null) {
                    transaction.rollback();
                }
            }
        }
    }
}
