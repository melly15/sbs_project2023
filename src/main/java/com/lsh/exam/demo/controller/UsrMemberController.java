package com.lsh.exam.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lsh.exam.demo.service.MemberService;
import com.lsh.exam.demo.utill.Ut;
import com.lsh.exam.demo.vo.Member;
import com.lsh.exam.demo.vo.ResultData;
import com.lsh.exam.demo.vo.Rq;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UsrMemberController {
   
   private MemberService memberService;
   
   public UsrMemberController(MemberService memberService) {
      this.memberService = memberService;
   }

   // 액션 메서드 시작
   @GetMapping("/usr/member/doJoin")
   @ResponseBody
   public ResultData<Member> doJoin(String loginId, String loginPw,String name, String nickname, String cellphoneNo, String email) {
   
      //if(loginId == null || loginId.trim().length()==0) loginId가 널 또는 앞뒤공백 제거후 0이거나
      if ( Ut.empty(loginId)) {
         return ResultData.from("F-1", "loginId(을)를 입력해 주세요.");
      }
      
      if ( Ut.empty(loginPw)) {
         return ResultData.from("F-2", "loginPw(을)를 입력해 주세요.");
      }
      
      if ( Ut.empty(name)) {
         return ResultData.from("F-3", "name(을)를 입력해 주세요.");
      }
      
      if ( Ut.empty(nickname)) {
         return  ResultData.from("F-4", "nickname(을)를 입력해 주세요.");
      }
      
      if (Ut.empty(email)) {
         return ResultData.from("F-5", "email(을)를 입력해 주세요.");
      }
      
      if ( Ut.empty(cellphoneNo)) {
         return ResultData.from("F-6", "cellphoneNo(을)를 입력해 주세요.");
      }
      
      //성공시S-1,회원가입 완료됨 MSG ,새로운 회원 번호 data1
      ResultData<Integer> joinRd = memberService.join(loginId, loginPw, name, nickname,email,cellphoneNo);
      
      if (joinRd.isFail()) {
         return (ResultData)joinRd;
      }
      
      Member member = memberService.getMemberById(joinRd.getData1());
      
      return ResultData.newData(joinRd, "member", member);
   }
   
   @GetMapping("/usr/member/doLogout")
   @ResponseBody
   public ResultData<Member> doLogout(HttpSession httpSession) {
      
      boolean isLogined = false;
      
      if (httpSession.getAttribute("loginedMemberId") == null) {
         isLogined = true;
      }
      
      if (isLogined) {
         return ResultData.from("S-1", "이미 로그아웃 상태입니다.");
      }
      
      httpSession.removeAttribute("loginedMemberId");
      
      return ResultData.from("S-2", "로그아웃 되었습니다.");
   }
   
   @RequestMapping("/usr/member/doLogin")
   @ResponseBody
   public String doLogin(HttpServletRequest req, String loginId, String loginPw) {
      Rq rq = (Rq) req.getAttribute("rq");
      
      if (rq.isLogined()) {
         return Ut.jsHistoryBack("이미 로그인 되었습니다.");
      }
   
      //if(loginId == null || loginId.trim().length()==0) loginId가 널 또는 앞뒤공백 제거후 0이거나
      if ( Ut.empty(loginId)) {
         return Ut.jsHistoryBack("loginId(을)를 입력해 주세요.");
      }
      
      if ( Ut.empty(loginPw)) {
         return Ut.jsHistoryBack("loginPw(을)를 입력해 주세요.");
      }
      
      Member member = memberService.getMemberByLoginId(loginId);
      
      if ( member == null) {
         return Ut.jsHistoryBack("존재하지 않는 로그인아이디 입니다.");
      }
      
      if (member.getLoginPw().equals(loginPw) == false) {
         return Ut.jsHistoryBack("비밀번호가 일치하지 않습니다.");
      }
      
      rq.login(member);
      
      return Ut.jsReplace(Ut.f("%s님 환영합니다.", member.getNickname()), "/");
   }
	@RequestMapping("/usr/member/login")
	public String showLogin(HttpSession httpSession) {
		return "usr/member/login";
	}
   
   
   @GetMapping("/usr/member/getMembers")
   @ResponseBody
   public List<Member> getMembers() {
      return memberService.getMembers();
   }

}