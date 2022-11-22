import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list")
public class ListController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Service 객체 생성
		BoardService service = new BoardService();

		// Service 객체로부터 BoardList를 가져와 저장
		List<Board> list = service.getBoardList();

		// request 저장소에 list 저장함으로써 외부에서 참조
		request.setAttribute("list", list);

		// Dispatcher를 통해 jsp 실행하고, Controller의 request/response를 View에 공유
		request.getRequestDispatcher("/NoticeBoardList.jsp").forward(request, response);

	}
}
