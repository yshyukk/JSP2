package co.edu.common;

import java.util.List;

public class MemberService {
	// 싱글톤
	//MemberDAO가 가지고 있는 입력,삭제기능 등을 여기서 처리
	//MemberDAO에서는 기능을 최대한 세분화, Service객체에서 필요한 기능 호출해서 사용 
	//FrontController에서 처리한 요청을 메서드를 실행.-> 메서드 안에서 DB에 접근한다.
	private static MemberService instance = new MemberService();
	private MemberService() {
		
	}
	public static MemberService getInstance() {
		return instance;
	}
	//입력기능. 삭제등 여기서 처리
	MemberDAO dao = new MemberDAO();
	public void memberAdd(MemberVO vo) {
		dao.insertMember(vo);
	}
	
	public List<MemberVO> memberList(){
		return dao.getList();
	}
	
}
