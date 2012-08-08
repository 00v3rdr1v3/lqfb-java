package org.lqfb.data.repositories;

import java.util.List;

import org.lqfb.entities.Member;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface MemberRepository extends PagingAndSortingRepository<Member, Integer> {

	
	@Query("FROM Member")
	List<Member> findAllMembers();
	
	@Query("FROM Member m where m.name = :memberName")
	Member findMemberByName(@Param("memberName") String name);
}
