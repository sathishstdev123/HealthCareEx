package com.dat.shaEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Spec_tab")
public class Specialization {
	 
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="spec_id_col")
	 private Long id;
	 
	 @Column(name="Spec_code_col")
	 private  String SpecCode;
	 
	 @Column(name="Spec_name_col")
	 private String Specname;
	 
	 @Column(name="Spec_note_col")
	 private String Specnote;

}
