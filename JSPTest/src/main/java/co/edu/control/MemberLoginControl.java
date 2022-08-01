package co.edu.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.common.Controller;
import co.edu.common.HttpUtil;

public class MemberLoginControl implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 로그인 성공 시 memberLoginSuccess.jsp로 이동.
		// 로그인 실패 시 memberLoginFail.jsp로 이동.
		HttpUtil.forward(req, resp, "member/memberLoginSuccess.tiles");
	}

}
