package co.dev.service;

import java.util.List;

import co.dev.dao.MemberDAO;
import co.dev.vo.MemberVO;

//비지니스 처리 영역
//싱글톤으로 
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
	//회원목록
	public List<MemberVO> memberList(){
		return dao.getList();
	}
	//회원검색(id로 단건조회)
	public MemberVO getMember(String id) {
		return dao.searchMember(id);
	}
	//회원정보 수정
	public void modifyMember(MemberVO vo) {
		dao.updateMember(vo);
	}
	//회원정보 삭제
	public void deleteMember(MemberVO vo) {
		dao.delete(vo);
	}
}
