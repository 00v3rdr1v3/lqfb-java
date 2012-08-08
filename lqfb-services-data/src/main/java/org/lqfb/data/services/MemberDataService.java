package org.lqfb.data.services;

import java.util.List;

import org.lqfb.entities.Member;

public interface MemberDataService {

	Member save(Member member);
	List<Member> findAllMembers();
	Member getMemberByName(String name);
	void delete(Member member);

}
