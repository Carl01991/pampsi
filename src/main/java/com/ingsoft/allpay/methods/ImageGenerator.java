package com.ingsoft.allpay.methods;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageGenerator {
	
	@Autowired
	ServletContext servletContext;
	
	public  File ByteArrayToImage(byte[] data) throws IOException {
		ByteArrayInputStream bis = new ByteArrayInputStream(data);
		BufferedImage bImage2 = ImageIO.read(bis);
		File f = new File(servletContext.getRealPath("/dpiimages/output.jpg"));
		ImageIO.write(bImage2, "jpg", f);
		return f;
	}
	

}
