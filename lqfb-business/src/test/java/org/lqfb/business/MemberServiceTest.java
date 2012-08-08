package org.lqfb.business;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lqfb.entities.Member;
import org.lqfb.services.business.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-business.xml" })
public class MemberServiceTest {

	@Autowired
	MemberService memberService;

	@Test
	public void testgetMemberByName() {
		Member member = new Member();
		member.setId(12121);
		member.setName("ServiceTest");
		member.setCreated(new Date());
		try {

			memberService.save(member);

			Member foundMember = memberService.getMemberByName("ServiceTest");

			Assert.assertEquals(member.getId(), foundMember.getId());

		} finally {
			memberService.delete(member);
		}

	}

}
