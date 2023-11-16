package jdbcEx;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;// sql�� ����Ʈ beans����

public class _01_JdbcEx {
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
//			stmt �� �������� ȣ���ϴ� ��ü

			ResultSet srs = stmt.executeQuery("select * from student");//��ȯ�� ResultSet���� ���� ��ü�� ����.
			printData(srs, "name", "id", "dept");//������� ���� �޼��� 
			
			srs = stmt.executeQuery("select stu_name, stu_no, stu_dept from student where name='���Ѻ�'");
			printData(srs, "name", "id", "dept");
			
		} catch (ClassNotFoundException e){
			System.out.println("JDBC ����̹� �ε����");// "JDBC ����̹� �ε����"��� ������ָ� �������� ����.
		} catch(SQLException e) {
			System.out.println("DB ���� ����");
		}
	}
	static void printData (ResultSet srs, String a, String b, String c)
			throws SQLException {
		System.out.print(a); //�ٽ�Ʈ�� �÷�������
		System.out.print("\t|\t" + b + "\t");
		System.out.println("\t|\t" + c);
		
		while (srs.next()) {

			System.out.print(srs.getString("stu_name")); //�ٽ�Ʈ�� �÷�������
			System.out.print("\t|\t" + srs.getString("stu_no"));
			System.out.print("\t|\t" + srs.getString("stu_dept"));
			System.out.println();
			}
	}
	
	
}


