/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.34
 * Generated at: 2020-05-05 18:50:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.Doctor;

public final class doctors_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.Doctor");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Doctor Service</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"Views/bootstrap.min.css\">\r\n");
      out.write("<script src=\"Components/jquery-3.2.1.min.js.js\"></script>\r\n");
      out.write("<script src=\"Components/doctor.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-6\">\r\n");
      out.write("\t\t\t\t<h1>Doctors Management</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<form id=\"formDoctor\" name=\"formDoctor\">\r\n");
      out.write("\t\t\t\t\tNIC: <input id=\"nic\" name=\"nic\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control form-control-sm\"> <br> Gender: <input\r\n");
      out.write("\t\t\t\t\t\tid=\"gender\" name=\"gender\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control form-control-sm\"> <br> First\r\n");
      out.write("\t\t\t\t\tName: <input id=\"firstName\" name=\"firstName\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control form-control-sm\"> <br> Last Name:\r\n");
      out.write("\t\t\t\t\t<input id=\"lastName\" name=\"lastName\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control form-control-sm\"> <br> Email: <input\r\n");
      out.write("\t\t\t\t\t\tid=\"email\" name=\"email\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control form-control-sm\"> <br>\r\n");
      out.write("\t\t\t\t\tSpecification: <input id=\"specification\" name=\"specification\"\r\n");
      out.write("\t\t\t\t\t\ttype=\"text\" class=\"form-control form-control-sm\"> <br>\r\n");
      out.write("\t\t\t\t\tContact: <input id=\"contact\" name=\"contact\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control form-control-sm\"> <br> Work Date:\r\n");
      out.write("\t\t\t\t\t<input id=\"workDate\" name=\"workDate\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control form-control-sm\"> <br> Work Time:\r\n");
      out.write("\t\t\t\t\t<input id=\"workTime\" name=\"workTime\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control form-control-sm\"> <br> Password:\r\n");
      out.write("\t\t\t\t\t<input id=\"password\" name=\"password\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control form-control-sm\"> <br> Admin ID:\r\n");
      out.write("\t\t\t\t\t<input id=\"adminID\" name=\"adminID\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control form-control-sm\"> <br> Doctor\r\n");
      out.write("\t\t\t\t\tStatus: <input id=\"doctorStatus\" name=\"doctorStatus\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control form-control-sm\"> <br> Valid: <input\r\n");
      out.write("\t\t\t\t\t\tid=\"valid\" name=\"valid\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control form-control-sm\"> <br> <input\r\n");
      out.write("\t\t\t\t\t\tid=\"btnSave\" name=\"btnSave\" type=\"button\" value=\"Save\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"btn btn-primary\"> <input type=\"hidden\"\r\n");
      out.write("\t\t\t\t\t\tid=\"hiddoctorIDSave\" name=\"hiddoctorIDSave\" value=\"\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"alertSuccess\" class=\"alert alert-success\"></div>\r\n");
      out.write("\t\t\t\t<div id=\"alertError\" class=\"alert alert-danger\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<div id=\"divDoctorsGrid\">\r\n");
      out.write("\t\t\t\t\t");

						 Doctor doctor = new Doctor();
 						 out.print(doctor.readDoctors());
					 
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
