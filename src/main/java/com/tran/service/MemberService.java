package com.tran.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tran.dao.MemberDao;
import com.tran.entity.Member;

@Service
public class MemberService {
	
	@Autowired
	MemberDao memberDao;
	
	public List<Member> getMembers() {
	
		return memberDao.getMembers();
	}

}
