import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/detail")
public class DetailController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String _id = request.getParameter("id");
		int id = 0;
		if (_id != null)
			id = Integer.parseInt(_id);

		BoardService service = new BoardService();
		Board board = service.getBoard(id);
		request.setAttribute("n", board);

		request.getRequestDispatcher("/NoticeBoardDetail.jsp").forward(request, response);
	}
}
