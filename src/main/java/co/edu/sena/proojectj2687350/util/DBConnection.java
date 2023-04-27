package co.edu.sena.proojectj2687350.util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBConnection {


    private static final String URL =
           "jdbc:mysql://aws.connect.psdb.cloud/rick?sslMode=VERIFY_IDENTITY";
    private static final String USER = "o3p5bhkdk3im3a6eyyfs";
    private static final String PASS = "pscale_pw_TTrCj4zXjTY5H6x0IEMvIWjXS0atR9gwEVwz63BtOdm";
    private static BasicDataSource pool;

    public static BasicDataSource getInstance() throws SQLException {
        if (pool == null){
            pool = new BasicDataSource();
            pool.setUrl(URL);
            pool.setUsername(USER);
            pool.setPassword(PASS);

            pool.setInitialSize(3);
            pool.setMinIdle(3);
            pool.setMaxIdle(8);
            pool.setMaxTotal(8);
        }
        return pool;
    }
    //getConnectionToDataBase
    public static Connection getConnection() throws SQLException {
        return getInstance().getConnection();
    }
}
