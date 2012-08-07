package org.lqfb.entities;

import java.sql.DriverManager;
import java.sql.SQLNonTransientConnectionException;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import junit.framework.TestCase;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MemberTest extends TestCase {

	private static Logger logger = LoggerFactory.getLogger(MemberTest.class);

	private EntityManagerFactory emFactory;

	private EntityManager em;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		try {
			logger.info("Building JPA EntityManager for unit tests");
			emFactory = Persistence.createEntityManagerFactory("testPU");
			em = emFactory.createEntityManager();
		} catch (Exception ex) {
			ex.printStackTrace();
			fail("Exception during JPA EntityManager instanciation.");
		}
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		logger.info("Shuting down Hibernate JPA layer.");
		if (em != null) {
			em.close();
		}
		if (emFactory != null) {
			emFactory.close();
		}
	}

	@Test
	public void test() {
		try {

			em.getTransaction().begin();
			Member member = new Member();
			member.setId(1234);
			member.setName("TestMember1234");
			member.setCreated(new Date());
			
			em.persist(member);
            assertTrue(em.contains(member));
            
            em.getTransaction().commit();
            
			em.getTransaction().begin();
			em.remove(member);
            em.getTransaction().commit();
            
		} catch (Exception ex) {
			em.getTransaction().rollback();
			ex.printStackTrace();
			fail("Exception during testPersistence");
		}

	}

}
