package co.edu.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.common.Controller;

public class AjaxMemberIdCheck implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idCheck = req.getParameter("id");

		PrintWriter out = resp.getWriter();
		if (idCheck.equals("user1")) {
			out.print("1");
		} else {
			out.print("0");
		}
	}

}
