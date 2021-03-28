package com.tran.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

import com.tran.entity.Member;

@Component
public class MemberDaoImpl implements MemberDao {
	
	@Autowired
	MongoOperations mongoOperation;

	@Override
	public List<Member> getMembers() {
		
		return mongoOperation.findAll(Member.class, "persons");
	}

}
