package co.edu.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.common.Controller;
import co.edu.common.HttpUtil;
import co.edu.service.MemberService;
import co.edu.vo.MemberVO;

public class MemberJoinFormControl implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
MemberService service = MemberService.getInstance();
		
		String id = req.getParameter("id");
		String passwd = req.getParameter("passwd");
		String name = req.getParameter("name");
		String address = req.getParameter("address");
		
		MemberVO vo = new MemberVO();
		vo.setId(id);
		vo.setName(passwd);
		vo.setPasswd(name);
		vo.setAddress(address);
	
		service.addMember(vo);
		
		req.setAttribute("member", vo);
		HttpUtil.forward(req, resp, "index.jsp");
	}

}
