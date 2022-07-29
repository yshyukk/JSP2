package co.dev.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;

public class MemberSearchController implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		String id = req.getParameter("id");
		String job = req.getParameter("job");

		// id가 없는 경우 결과페이지
		if (id.isEmpty()) {
			req.setAttribute("error", "id를 입력하세요");
			if (job.equals("search")) {
				Utils.forward(req, resp, "memberView/memberSearch.jsp");
			} else if (job.equals("update")) {
				Utils.forward(req, resp, "memberView/memberUpdate.jsp");
			} else if (job.equals("delete")) {
				Utils.forward(req, resp, "memberView/memberDelete.jsp");
			}
			return;
		}

		MemberService service = MemberService.getInstance();
		MemberVO vo = service.getMember(id);
		if (vo == null) {
			req.setAttribute("result", "검색된 정보가 없습니다.");
		}
		// id를 받아서 member에 담
		req.setAttribute("member", service.getMember(id));

		if (job.equals("search")) {
			Utils.forward(req, resp, "memberResult/memberSearchOutput.jsp");
		} else if (job.equals("update")) {
			Utils.forward(req, resp, "memberView/memberUpdate.jsp");
		}else if (job.equals("delete")) {
			Utils.forward(req, resp, "memberView/memberDelete.jsp");
		}
	}
}
