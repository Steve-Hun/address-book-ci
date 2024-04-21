import com.example.addressbook.model.SqliteConnection;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DatabaseTest {

    @Test
    void testConnection() {
        Connection conn = SqliteConnection.getInstance();
        assertTrue(conn != null);
    }
}
