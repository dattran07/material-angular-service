package com.tran.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tran.entity.Member;
import com.tran.service.MemberService;

@RestController
@RequestMapping("/api")
public class MemberController {
	
	@Autowired
	MemberService memberService;

	@GetMapping("/members")
	public List<Member> getMembers() {
		return memberService.getMembers();
	}
	
	
}
