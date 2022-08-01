package co.edu.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import co.edu.common.Controller;
import co.edu.service.BoardService;
import co.edu.vo.BoardVO;

//게시글 등록
public class AddBoardControl implements Controller {
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		Utils.forward(req, resp, "board/insertBoard.tiles");
		
	}

	
}
