package co.dev.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	//추상메서드
	//execute를 구현해줘야 하는 책임이있음. -> 
	// map에 담기위해서 자료형이 같아야함. 따라서 자료형을 하나로 통합해주는 역할
	// MemberInsertController,MemberListController는 각각 다른 자료형 -> controller를 사용해 자료형을 통합해야 map에 담을 수 있음 
	public void execute(HttpServletRequest req, HttpServletResponse resp);
}
