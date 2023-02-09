import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update2")
public class UpdateController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// form으로 얻은 값 추출
		String id = request.getParameter("id"); // 변경이 없는
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
//		int _views = Integer.parseInt(request.getParameter("views"));//
//		Date _regDate = Date.parse(request.getParameter("regDate")); // 등록일은 변경이 안됨
		String content = request.getParameter("content");
		System.out.println(id + "  " + title + " " + writer + " " + content);

		// 값 수정
		BoardService service = new BoardService();
		service.updateBoard(Integer.parseInt(id), writer, title, content);

		// Redirect
		response.sendRedirect("list");
		// 할필요가 있는가 updateBoard()에서 getBoardList를 호출하는 쪽이 맞는게?
	}
}
