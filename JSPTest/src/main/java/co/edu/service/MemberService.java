package co.edu.service;

import co.edu.dao.MemberDAO;
import co.edu.vo.MemberVO;



public class MemberService {
	
private static MemberService instance = new MemberService();
	
	MemberDAO dao = new MemberDAO();
	
	private MemberService() {}
	public static MemberService getInstance() {
		return instance;
	}
	//회원가입
	public void addMember(MemberVO vo) {
		dao.insertMember(vo);
	}
}
