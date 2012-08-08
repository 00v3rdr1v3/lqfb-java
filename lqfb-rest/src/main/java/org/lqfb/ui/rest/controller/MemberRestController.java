package org.lqfb.ui.rest.controller;

import org.lqfb.entities.Member;
import org.lqfb.services.business.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/member")
public class MemberRestController {

	@Autowired
	MemberService memberService;
	
	private static Logger logger = LoggerFactory.getLogger(MemberRestController.class);

	@RequestMapping(value="/name/{name}", method=RequestMethod.GET)
    public Member getMemberByName(@PathVariable String name) {

        Member member = memberService.getMemberByName(name);
        logger.info("Found member "+member);
        return member;
    }
}
