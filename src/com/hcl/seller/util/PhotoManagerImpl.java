package com.hcl.seller.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

public class PhotoManagerImpl implements PhotoManager {
	private static final String FILE_EXTENSION = ".jpeg";
	private final String uploadPath;
	private final String relativePath;
	
	private static String getParsedResourcePath(String resourcePath) {
		StringBuilder sb = new StringBuilder();
		
		for(char c : resourcePath.toCharArray()) {
			if(c == '\\') {
				sb.append('/');
			} else {
				sb.append(c);
			}
		}
		
		return sb.toString();
	}


	public PhotoManagerImpl(String uploadPath) {
		super();
		uploadPath = getParsedResourcePath(uploadPath);
		this.uploadPath = uploadPath + "photos";
		this.relativePath = "./photos";
		System.out.println(uploadPath);
	}

	@Override
	public String savePhoto(InputStream photo) {

		File uploadDir = new File(uploadPath);

		if (!uploadDir.exists()) {
			uploadDir.mkdir();
		}

		UUID uuid = UUID.randomUUID();
		String photoURL = uploadPath + "/" + uuid.toString() + FILE_EXTENSION;
		String photoRelativeURL = relativePath + "/" + uuid.toString() + FILE_EXTENSION;
		File photoFile = new File(photoURL);

		int read;
		byte [] buffer = new byte[1024];
		try (OutputStream out = new FileOutputStream(photoFile)){
			while((read = photo.read(buffer)) != -1) {
				out.write(buffer, 0, read);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 

		return photoRelativeURL;
	}

}
