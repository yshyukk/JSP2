package co.edu.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.common.Controller;
import co.edu.common.HttpUtil;
import co.edu.service.BoardService;
import co.edu.vo.BoardVO;

public class BoardListControl implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BoardService service = BoardService.getInstance();
		
		List<BoardVO> list = service.BoardList();
		
		req.setAttribute("list", list);
		HttpUtil.forward(req, resp, "board/boardList.tiles");
		
	}

}
