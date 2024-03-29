package com.lsh.exam.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.GetMapping;
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lsh.exam.demo.service.MemberService;
import com.lsh.exam.demo.utill.Ut;
import com.lsh.exam.demo.vo.Member;
import com.lsh.exam.demo.vo.ResultData;
import com.lsh.exam.demo.vo.Rq;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
@Controller
public class UsrMemberController {
	private MemberService memberService;
	private Rq rq;
	
	public UsrMemberController(MemberService memberService, Rq rq) {
		this.memberService = memberService;
		this.rq = rq;
	}
	
	@RequestMapping("/usr/member/doJoin")
	@ResponseBody
	public ResultData<Member> doJoin(String loginId, String loginPw, String name, String nickname, String cellphoneNo, String email) {
<<<<<<< HEAD
			
=======
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
		if ( Ut.empty(loginId) ) {
			return ResultData.from("F-1", "loginId(을)를 입력해주세요.");
		}
		
		if ( Ut.empty(loginPw) ) {
			return ResultData.from("F-2", "loginPw(을)를 입력해주세요.");
		}
		
		if ( Ut.empty(name) ) {
			return ResultData.from("F-3", "name(을)를 입력해주세요.");
		}
		
		if ( Ut.empty(nickname) ) {
			return ResultData.from("F-4", "nickname(을)를 입력해주세요.");
		}
		
		if ( Ut.empty(cellphoneNo) ) {
			return ResultData.from("F-5", "cellphoneNo(을)를 입력해주세요.");
		}
		
		if ( Ut.empty(email) ) {
			return ResultData.from("F-6", "email(을)를 입력해주세요.");
		}
		
		// S-1
		// 회원가입이 완료되었습니다.
		// 7
		ResultData<Integer> joinRd = memberService.join(loginId, loginPw, name, nickname, cellphoneNo, email);
		
		if ( joinRd.isFail() ) {
			return (ResultData)joinRd;
		}
		
		Member member = memberService.getMemberById(joinRd.getData1());
		
		return ResultData.newData(joinRd, "member", member);
	}
	
	@RequestMapping("/usr/member/doLogout")
	@ResponseBody
	public String doLogout() {
<<<<<<< HEAD
		
=======
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
		if ( !rq.isLogined() ) {
			return rq.jsHistoryBack("이미 로그아웃 상태입니다.");
		}
		
		rq.logout();
		
		return rq.jsReplace("로그아웃 되었습니다.", "/");
	}
	
	@RequestMapping("/usr/member/login")
	public String showLogin() {
		return "usr/member/login";
	}
	
	@RequestMapping("/usr/member/doLogin")
	@ResponseBody
	public String doLogin(String loginId, String loginPw) {
<<<<<<< HEAD
		
=======
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
		if ( rq.isLogined() ) {
			return rq.jsHistoryBack("이미 로그인되었습니다.");
		}
		
		if ( Ut.empty(loginId) ) {
			return rq.jsHistoryBack("loginId(을)를 입력해주세요.");
		}
		
		if ( Ut.empty(loginPw) ) {
			return rq.jsHistoryBack("loginPw(을)를 입력해주세요.");
		}
		
		Member member = memberService.getMemberByLoginId(loginId);
		
		if ( member == null ) {
			return rq.jsHistoryBack("존재하지 않은 로그인아이디 입니다.");
		}
		
		if ( member.getLoginPw().equals(loginPw) == false ) {
			return rq.jsHistoryBack("비밀번호가 일치하지 않습니다.");
		}
		
		rq.login(member);
		
		return rq.jsReplace(Ut.f("%s님 환영합니다.", member.getNickname()), "/");
	}
	
	@RequestMapping("/usr/member/getMembers")
	@ResponseBody
	public List<Member> getMembers() {
		return memberService.getMembers();
	}
}