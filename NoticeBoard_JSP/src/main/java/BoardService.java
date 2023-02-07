import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoardService {

	// Board 리스트 가져오기
	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<>();

		String sql = "SELECT * FROM BOARD ORDER BY REGDATE DESC";
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, "PRACTICE2", "1111");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				// 한줄씩 읽어서
				int id = rs.getInt("ID");
				String title = rs.getString("TITLE");
				String writer = rs.getString("WRITER");
				Date regDate = rs.getDate("REGDATE");
				int views = rs.getInt("VIEWS");
				String content = rs.getString("CONTENT");

				// 객체에 저장하고
				Board board = new Board(id, title, writer, regDate, views, content);

				// 리스트에 넣기
				list.add(board);
//				System.out.println(board.toString()); // 체크 
			}
			rs.close();
			st.close();
			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public int insertBoard(Board board) {
		int result = 0;

		String sql = "INSERT INTO BOARD(TITLE, WRITER, CONTENT) VALUES (?,?,?)";
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, "PRACTICE2", "1111");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, board.getTitle());
			st.setString(2, board.getWriter());
			st.setString(3, board.getContent());
			result = st.executeUpdate();

			st.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	public Board getBoard(int nid) {
		Board board = null;

		String sql = "SELECT * FROM BOARD WHERE ID = ?";
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, "PRACTICE2", "1111");
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, nid);
			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				int id = rs.getInt("ID");
				String title = rs.getString("TITLE");
				String writer = rs.getString("WRITER");
				Date regDate = rs.getDate("regDate");
				int views = rs.getInt("VIEWS");
				String content = rs.getString("CONTENT");

				board = new Board(id, title, writer, regDate, views, content);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return board;
	}

	public int updateBoard(int id, String title, String writer, String content) {
		// nid가 같은
		String sql = "UPDATE BOARD SET TITLE = ?, WRITER =  ?, CONTENT = ? WHERE ID = ?";
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, "PRACTICE2", "1111");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, title);
			st.setString(2, writer);
			st.setString(3, content);
			st.setInt(4, id);

			st.executeQuery();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

	public int deleteBoard() {
		return 0;
	}

}
