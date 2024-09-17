package com.jpa.Hibernate_File_Strore.Controller;

import java.io.File;

import com.jpa.Hibernate_File_Strore.dao.FileStorageDao;
import com.jpa.Hibernate_File_Strore.dto.FileStorage;

public class FileStorageController {

	public static void main(String[] args) {
		
//		FileStorage file=new FileStorage("E://Webtech 1-30 new Batch//CSS//image/linkedin_logo.png");
		FileStorageDao doa=new FileStorageDao();
//		
//		doa.saveFileStorageDao(file);
				
		
		doa.getFileDao(1);
		

	}

}
