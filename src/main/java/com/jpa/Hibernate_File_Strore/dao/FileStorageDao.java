package com.jpa.Hibernate_File_Strore.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jpa.Hibernate_File_Strore.dto.FileStorage;

public class FileStorageDao {
	
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("jpa");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public FileStorage saveFileStorageDao(FileStorage file) {
		
		
		Path path=Path.of(file.getFileName());
		
		try {
			byte[] bs =Files.readAllBytes(path);
			file.setFile(bs);
			et.begin();
			em.persist(file);
			et.commit();
			
			return file;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	public FileStorage getFileDao(int fileId) {
		FileStorage file=em.find(FileStorage.class, fileId);
		
		if(file!=null) {
			
			try {
				
				byte[] fi=file.getFile();
				
				FileOutputStream fis=new FileOutputStream("E://Webtech 1-30 new Batch//CSS//image//download.png");
				fis.write(fi);
				return file;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		return file;
	}

}
