package org.lqfb.services.business;

import org.lqfb.entities.Member;

public interface MemberService {

	Member getMemberByName(String name);
	Member save(Member member);
	void delete(Member member);


}
