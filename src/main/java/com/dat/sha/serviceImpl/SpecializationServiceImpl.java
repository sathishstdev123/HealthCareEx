package com.dat.sha.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dat.sha.Entity.Specialization;
import com.dat.sha.Service.ISpecializationService;
import com.dat.sha.repo.SpecializationRepository;

@Service
public class SpecializationServiceImpl  implements ISpecializationService {
	
	@Autowired
	private SpecializationRepository repo;

	@Override
	public Long saveSpec(Specialization spec) {
		return repo.save(spec).getId();
	}

	@Override
	public List<Specialization> getAllSpec() {		
		return repo.findAll();
	}

	@Override
	public void removeSpec(Long lg) {
		repo.deleteById(lg);
	}

	@Override
	public Specialization getOneSpec(Long lg) {
		return repo.getById(lg);
	}

	@Override
	public void updateSpec(Specialization spec) {
		repo.save(spec);
		
	}

}
