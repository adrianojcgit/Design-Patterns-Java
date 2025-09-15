import conn.Connection;
import conn.ConnectionPool;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Connection Pool Size: " + ConnectionPool.POOL_SIZE);
        int pool = ConnectionPool.POOL_SIZE;
        System.out.println(pool);
        doQuery1();
        doQuery2();
        doQuery3();
    }

    public static void doQuery1() {
        ConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConnection();
        if(conn != null)
            conn.query("SELECT * FROM A1");
    }

    public static void doQuery2() {
        ConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConnection();
        if(conn != null)
            conn.query("SELECT * FROM A2");
    }

    public static void doQuery3() {
        ConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConnection();
        if(conn != null)
            conn.query("SELECT * FROM A3");
    }
}