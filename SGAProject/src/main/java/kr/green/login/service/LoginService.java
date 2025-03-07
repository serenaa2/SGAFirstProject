package kr.green.login.service;

import kr.green.login.vo.MemberVO;
import kr.green.login.vo.PersonVO;

public interface LoginService {
	// 회원가입
	void welcomeMember(MemberVO memberVO);
	// 회원정보 가져오기
	MemberVO getMember(int idx);
	// 회원 정보 수정
	void update(MemberVO memberVO);
	// 회원 탈퇴
	void delete(MemberVO memberVO);
	// 아이디 찾기
	MemberVO selectId(int idx);
	// 비밀번호 찾기(수정)
	void updatePassword(MemberVO memberVO);
	// bmi 값 등록
	void insertBmi(PersonVO personVO);
	// bmi 값 삭제
	void deleteBmi(PersonVO personVO);
	// 로그인 
	void memberLogin(MemberVO memberVO);

}
