package com.india.Spring;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class UploadController {
	
	@RequestMapping("/home")
	public String hom()
	{
		return "UploadForm";
	}
	
	public String saveDir="E:\\SpringExample\\TutorialPoint\\UploadFiles\\";
	
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	public String uploadf(HttpServletRequest req,@RequestParam CommonsMultipartFile[] fileupload) throws Exception
	{
		if(fileupload !=null &&fileupload.length>0)
		{
			for(CommonsMultipartFile afile:fileupload)
			{
				System.out.println("saving file :"+afile.getOriginalFilename());
				if (!afile.getOriginalFilename().equals(""))
				{
					afile.transferTo(new File(saveDir+afile.getOriginalFilename()));
				}
			}
		}	
		return "Result";
	}

}
