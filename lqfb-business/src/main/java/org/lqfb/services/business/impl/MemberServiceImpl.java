package org.lqfb.services.business.impl;

import org.lqfb.data.services.MemberDataService;
import org.lqfb.entities.Member;
import org.lqfb.services.business.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDataService memberDataService;
	
	public Member getMemberByName(String name) {
		return memberDataService.getMemberByName(name);
	}
	
	public Member save(Member member){
		return memberDataService.save(member);
	}

	public void delete(Member member) {
		memberDataService.delete(member);
		
	}

}
