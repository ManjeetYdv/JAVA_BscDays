package company;

import java.io.File;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;



@WebServlet("/uploadFiles")
public class test extends HttpServlet {
	
	
	public void service(HttpServletRequest request , HttpServletResponse response) throws IOException  , ServletException{
		
	
		try {
			ServletFileUpload sFileUpload =new ServletFileUpload(new DiskFileItemFactory());
			List<FileItem> files = sFileUpload.parseRequest(request);
			
			
			for(FileItem items : files) {
				
				items.write(new File("E:\\" + items.getName()));;
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		response.sendRedirect("index.jsp");
		
	

		
	}

}
