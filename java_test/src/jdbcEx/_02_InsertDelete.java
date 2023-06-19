package jdbcEx;

import java.io.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;// sql�� ����Ʈ beans����

public class _02_InsertDelete {

	public static void main(String[] args) {
		
		Connection conn;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "system";
			String db_pw = "test123";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("DB���� �Ϸ�");
			stmt = conn.createStatement();
			
//			stmt.executeUpdate("insert into student (stu_no, stu_name, stu_dept) values('12345678','���缮', '���')");
			printTable(stmt);

			stmt.executeUpdate("update student set stu_dept ='��ǻ������' where stu_name='���缮'");
			printTable(stmt);

//			stmt.executeUpdate("delete from student where stu_name='���缮'");
			printTable(stmt);
		} catch (ClassNotFoundException e){
			System.out.println("JDBC ����̹� �ε����");// "JDBC ����̹� �ε����"��� ������ָ� �������� ����.
		} catch(SQLException e) {
			System.out.println("DB ���� ����");
		}
	}
	static void printTable(Statement stmt) throws SQLException {
		ResultSet srs = stmt.executeQuery("select * from student where stu_name = '���缮'");
		while (srs.next()) {
		System.out.print(srs.getString("stu_name"));
		System.out.print("\t|\t" + srs.getString("stu_no"));
		System.out.println("\t|\t" + srs.getString("stu_dept"));
		}
	}
}


