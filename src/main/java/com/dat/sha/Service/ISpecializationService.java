package com.dat.sha.Service;

import java.util.List;

import com.dat.sha.Entity.Specialization;

public interface ISpecializationService {
	 
	 public Long saveSpec(Specialization spec);
	  public List<Specialization> getAllSpec();
	  public void removeSpec (Long lg);
	  public Specialization getOneSpec(Long lg);
	  public void updateSpec(Specialization spec);

}
