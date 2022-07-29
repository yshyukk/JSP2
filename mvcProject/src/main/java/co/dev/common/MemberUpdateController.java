package co.dev.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;

// 수정컨트롤
public class MemberUpdateController implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		
		//파라메터
		String id = req.getParameter("id");
		String pw = req.getParameter("passwd");
		String nm = req.getParameter("name");
		String ml = req.getParameter("mail");
		
		//req(요청)으로 받아온 parameter를 vo로 전달
		MemberVO vo = new MemberVO();
		
		vo.setId(id);
		vo.setMail(ml);
		vo.setName(nm);
		vo.setPasswd(pw);
		
		MemberService service = MemberService.getInstance();
		service.modifyMember(vo);
		
		// 공유 : vo
		req.setAttribute("member", vo);
		Utils.forward(req, resp, "memberResult/memberUpdateOutput.jsp");
		 
	}

}
