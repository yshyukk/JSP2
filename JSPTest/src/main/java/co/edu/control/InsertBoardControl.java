package co.edu.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.common.Controller;
import co.edu.service.BoardService;
import co.edu.vo.BoardVO;

public class InsertBoardControl implements Controller{
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
BoardService service = BoardService.getInstance();
		
		String title = req.getParameter("title");
		String writer = req.getParameter("writer");
		String content = req.getParameter("content");
		
			
		BoardVO vo = new BoardVO();
		
		vo.setTitle(title);
		vo.setWriter(writer);
		vo.setContent(content);
		
		service.addBoard(vo);;

		req.setAttribute("board", vo);

		// forward기능?
		Utils.forward(req, resp, "board/insertBoardOutput.tiles");
		
	
		
	}
}
