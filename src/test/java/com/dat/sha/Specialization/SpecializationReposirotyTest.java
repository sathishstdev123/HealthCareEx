package com.dat.sha.Specialization;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.dat.sha.Entity.Specialization;
import com.dat.sha.repo.SpecializationRepository;

@DataJpaTest(showSql = true)
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class SpecializationReposirotyTest {

	@Autowired
	private SpecializationRepository repo;

	/**
	 * 1.Test save operation
	 */

	@Test
	@Disabled
	public void testSpecCreate() {
		Specialization spec = new Specialization(null, "CRDL", "Cardiologists", "Expert in heart and blood vessesl");
		spec = repo.save(spec);
		assertNotNull(spec.getId(), "Spec is not created");
	}

	@Test
	@Order(2)
	public void testSpecall() {
		List<Specialization> list = repo.findAll();
		assertNotNull(list);
//		assertThat(list.size()> 0);
		if (list.isEmpty()) {
			fail("no Data found");
		}
	}
}
