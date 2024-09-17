package com.jpa.Hibernate_File_Strore.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class FileStorage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Lob
	private byte[] file;
	
	
	@Transient
	private String fileName;


	public FileStorage(String fileName) {
		super();
		this.fileName = fileName;
	}
	
	

}
