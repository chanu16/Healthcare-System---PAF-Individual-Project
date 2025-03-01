package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Doctor;
import java.io.IOException;
import java.util.HashMap; 
import java.util.Map; 
import java.util.Scanner; 


/**
 * Servlet implementation class DoctorAPI
 */
@WebServlet("/DoctorAPI")
public class DoctorAPI extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Doctor doctor = new Doctor();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorAPI() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//NOT USED
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String output = doctor.insertDoctor(request.getParameter("nic"), request.getParameter("gender"), request.getParameter("firstName"),
				request.getParameter("lastName"), request.getParameter("email"),request.getParameter("specification"),request.getParameter("contact"),
				request.getParameter("workDate"),request.getParameter("workTime"),request.getParameter("password"),request.getParameter("adminID"),
				request.getParameter("doctorStatus")); 
			//request.getParameter("valid"));
		
				response.getWriter().write(output);
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Map paras = getParasMap(request); 
		String output = doctor.updateDoctor(paras.get("hiddoctorIDSave").toString(),
				paras.get("nic").toString(),
				paras.get("gender").toString(),
				paras.get("firstName").toString(),
				paras.get("lastName").toString(),
				paras.get("email").toString().replace("%40", "@"),
				paras.get("specification").toString(),
				paras.get("contact").toString(),
				paras.get("workDate").toString(),
				paras.get("workTime").toString(),
				paras.get("password").toString(),
				paras.get("adminID").toString(),
				paras.get("doctorStatus").toString());
				//paras.get("valid").toString());
		
				response.getWriter().write(output);
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 Map paras = getParasMap(request); 
		 
		 String output = doctor.deleteDoctor(paras.get("doctorID").toString());
		 
		 response.getWriter().write(output);
		// TODO Auto-generated method stub
	}
	
	// Convert request parameters to a Map 
	private static Map getParasMap(HttpServletRequest request) 
	{  
		Map<String, String> map = new HashMap<String, String>();  
		try  
		{   
			Scanner scanner = new Scanner(request.getInputStream(), "UTF-8");  
			String queryString = scanner.hasNext() ?       
					scanner.useDelimiter("\\A").next() : "";   
			scanner.close(); 
	 
			String[] params = queryString.split("&");  
			for (String param : params)  
			{ 
	  
				String[] p = param.split("=");   
				map.put(p[0], p[1]);  
			} 
	  }  
	  catch (Exception e) 
		{ 
		  
		}
		return map; 
		
		} 

}
