package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by user on 16.04.2017.
 */
public class DBTableCreator { public static void main(String[] args) {
    Connection c = null;
    Statement stmt = null;
    String sql = "";
    try {
        Class.forName("org.postgresql.Driver");
        c = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/postgres",
                        "postgres", "postgres");

        stmt = c.createStatement();

        sql = "CREATE SCHEMA IF NOT EXISTS JAVA_MONEY ";
        stmt.executeUpdate(sql);

        sql = "CREATE TABLE IF NOT EXISTS JAVA_MONEY.TARGET "
                + " ( "
                + " ID                      SERIAL PRIMARY KEY     NOT NULL, "
                + " TARGET                  VARCHAR(32)            NOT NULL, "
                + " TARGET_AMOUNT           INT                    NOT NULL, "
                + " TARGET_DATE             DATE                   NOT NULL  "
                + " ) ";
        stmt.executeUpdate(sql);

        sql = "CREATE TABLE IF NOT EXISTS JAVA_MONEY.ACCUMULATION "
                + " ( "
                + " ID                      SERIAL PRIMARY KEY     NOT NULL, "
                + " AMOUNT                  INT                    NOT NULL, "
                + " AC_DATE                 DATE                   NOT NULL, "
                + " TARGET_ID               INT                    NOT NULL  "
                + " ) ";
        stmt.executeUpdate(sql);

        sql = "ALTER TABLE JAVA_MONEY.ACCUMULATION "
                + " ADD CONSTRAINT FK_TARGET "
                + " FOREIGN KEY (TARGET_ID) REFERENCES JAVA_MONEY.TARGET (ID) MATCH FULL "
                + " ";
        stmt.executeUpdate(sql);

        stmt.close();
        c.close();
    } catch (Exception e) {
        e.printStackTrace();
        System.err.println(e.getClass().getName()+": "+ e.getMessage());
        System.exit(0);
    }
    System.out.println("Tables are created successfully");
}
}
