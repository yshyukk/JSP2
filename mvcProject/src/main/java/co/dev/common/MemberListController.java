package co.dev.common;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.common.MemberService;
import co.edu.common.MemberVO;

public class MemberListController implements Controller{
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		
		MemberService service = MemberService.getInstance();
		
		List<MemberVO> list = service.memberList();
		
		req.setAttribute("list", list);
		Utils.forward(req, resp, "memberResult/memberListOutput.jsp");
		
	}
}
