package jdbcEx;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;// sql�� ����Ʈ beans����
import java.util.Scanner;

public class _04_ScannerDBEx {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
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
			
			while (true) {
				
				System.out.print("(1)�Է�, (2)���, (3)����, (4)����");
				int num = s.nextInt();
				
				if (num == 1) {
					System.out.print("�й� �Է� : ");
					String stu_no = s.next();
					System.out.print("�̸� �Է� : ");
					String stu_name = s.next();
					System.out.print("�а� �Է� : ");
					String stu_dept = s.next();
					stmt.executeUpdate("insert into student(stu_no, stu_name, stu_dept) values('" + stu_no + "', '" + stu_name + "', '" + stu_dept + "')");
				
				}else if (num==2) {
					System.out.println("�˻��� �̸��� �Է����ּ���.");
					String stu_name = s.next();
					printTable(stmt, stu_name);
				
				}else if (num==3) {
					System.out.println("������ �̸��� �Է����ּ���.");
					String stu_name = s.next();
					stmt.executeUpdate("delete from student where stu_name='" + stu_name + "'");
					printTable(stmt, stu_name);

				}else if (num==4) 
					break;
			}//while end
		} catch (ClassNotFoundException e){
			System.out.println("JDBC ����̹� �ε����");// "JDBC ����̹� �ε����"��� ������ָ� �������� ����.
		} catch(SQLException e) {
			System.out.println("DB ���� ����");
		}
	}
	static void printTable(Statement stmt, String stu_name) throws SQLException{
		ResultSet srs =  stmt.executeQuery("select * from student where stu_name = '" + stu_name + "'");
		if(srs.next()){
			System.out.print(srs.getString("stu_name"));
			System.out.print("\t|\t" + srs.getString("stu_no"));
			System.out.println("\t|\t" +  srs.getString("stu_dept"));
		}
	}
}