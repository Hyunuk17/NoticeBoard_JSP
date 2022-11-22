import java.sql.Connection;
import java.sql.DriverManager;
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

	public int insertBoard() {
		return 0;
	}

	public int deleteBoard() {
		return 0;
	}

	public int updateBoard() {
		return 0;
	}

}
