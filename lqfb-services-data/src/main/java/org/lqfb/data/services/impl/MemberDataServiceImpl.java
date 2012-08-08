package org.lqfb.data.services.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.lqfb.data.repositories.MemberRepository;
import org.lqfb.data.services.MemberDataService;
import org.lqfb.entities.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
@Component()
public class MemberDataServiceImpl implements MemberDataService {

	@PersistenceContext
	private EntityManager em;

	@Autowired
	private MemberRepository repository;

	@Transactional
	public Member save(Member member) {
		return repository.save(member);
	}
	
	public List<Member> findAllMembers(){
		return repository.findAllMembers();
	}

	@Override
	public Member getMemberByName(String name) {
		return repository.findMemberByName(name);
	}

	@Override
	public void delete(Member member) {
		repository.delete(member);
	}
}
