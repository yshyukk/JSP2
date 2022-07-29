package co.dev.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;


public class MemberInsertController implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		
		MemberService service = MemberService.getInstance();
		
		String id = req.getParameter("id");
		String pw = req.getParameter("passwd");
		String nm = req.getParameter("name");
		String ml = req.getParameter("mail");
		
		
		MemberVO vo = new MemberVO();
		vo.setId(id);
		vo.setName(nm);
		vo.setPasswd(pw);
		vo.setMail(ml);

		service.addMember(vo);

		// 요청정보 녀석에 처리결과 뷰페이지 전송
		req.setAttribute("member", vo);

		// forward기능?
		Utils.forward(req, resp, "memberResult/memberInsertOutput.jsp");
		
	}

}
