package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import iBatistest.DTO;
import iBatistest.Dao;

public class MainServlet extends HttpServlet{

	private static final long serialVersionUID = 1136659365241564996L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		this.getServletConfig().getServletContext().getRealPath("/WEB-INF/config/");
		
		String request = req.getRequestURL().toString();
		System.out.println("요청데이터:" + request);
//		
//		String driver = "oracle.jdbc.driver.OracleDriver";
//        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
//        String user = "scott";
//        String password = "tiger";
//        try {
//               Class.forName(driver);
//               System.out.println("jdbc driver 로딩 성공");
//               DriverManager.getConnection(url, user, password);
//               System.out.println("오라클 연결 성공");
//        } catch (ClassNotFoundException e) {
//               System.out.println("jdbc driver 로딩 실패");
//        } catch (SQLException e) {
//               System.out.println("오라클 연결 실패");
//        }
        
//        try {
//			Context envCtx =  new InitialContext();
//			DataSource ds = (DataSource) envCtx.lookup("java:comp/env/jdbc/orcl");
//			Connection conn =ds.getConnection();
//			PreparedStatement p= conn.prepareStatement("select count(*) as b from emp");
//			ResultSet rs = p.executeQuery();
//			while(rs.next()) {
//				System.out.println(rs.getInt("b"));
//			}
//        } catch (NamingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        
		try {
			List<DTO> list = new Dao().selectEMP();
			System.out.println(list.size());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
