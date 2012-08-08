package org.lqfb.service;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lqfb.data.services.MemberDataService;
import org.lqfb.entities.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-data-services-test.xml" })
public class MemberServiceTest {

	@Autowired
	private MemberDataService memberService;
	
	@Test
	@Transactional
	public void testSave() {
			
			List<Member> allMembers = memberService.findAllMembers();
			
			Member member = new Member();
			member.setId(12121);
			member.setName("ServiceTest");
			member.setCreated(new Date());
			
			memberService.save(member);

			allMembers = memberService.findAllMembers();
			
	}

}
