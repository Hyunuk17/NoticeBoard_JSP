import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insert")
public class InsertController extends HttpServlet {
	@Override // 페이지 실행
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/NoticeBoardInsert.jsp").forward(request, response);
	}

	@Override // form으로부터 받음
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Service 객체 생성
		BoardService service = new BoardService();

		// form에서 받은 값을 Board 객체에 넣고 Insert 시키기
//		int id = request.getParameter(getServletName());// id는 자동 생성 되어야 함 // 등록하지 않아도 기본값 설정 sql에서 되있어서 문제 없는듯?
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
//		Date regDate = request.getParameter(writer); // Date도 알아서 // 현재시간 담는 법?
		String content = request.getParameter("content");
//		int views = request.getParameter("views");// views도 알아서 // 객체에서 0으로 초기화?

		Board board = new Board();
//		board.setId(0);	
		board.setTitle(title);
		board.setWriter(writer);
//		board.setRegDate(null);
		board.setContent(content);
//		board.setViews(0);

		//
		service.insertBoard(board);

		response.sendRedirect("/NoticeBoard_JSP/list");
	}
}
