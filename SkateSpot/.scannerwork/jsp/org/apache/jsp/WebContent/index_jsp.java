/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat9
 * Generated at: 2021-02-04 20:55:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WebContent;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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

      out.write("\r\n<!DOCTYPE html>\r\n<html lang=\"it\">\r\n<head>\r\n<meta charset=\"ISO-8859-1\">\r\n<title>Homepage</title>\r\n<link rel=\"stylesheet\" href=\"css/style1.css\" />\r\n<script src=\"js/script1.js\" ></script>\r\n</head>\r\n<body>\r\n\t<div>\r\n\t\t<h1 id=\"title\">SkateSpot</h1>\r\n\t</div>\r\n\t<div>\r\n\t\t<table>\r\n\t\t\t<tr>\r\n\t\t\t\t<th>\r\n\t\t\t\t</th>\r\n\t\t\t\t<td >\r\n\t\t\t\t\t<img src=\"images/menu_grey.png\" alt=\"MENU\"/>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<img src=\"images/Triangle.png\" alt=\"DROP\"/>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<input type=\"image\" onclick=\"\" src=\"images/premium_area.png\" alt=\"PREMIUM AREA\"/>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<img src=\"images/blank.png\" alt=\"SPACE\"/>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<img src=\"images/blank.png\" alt=\"SPACE\"/>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<img src=\"images/blank.png\" alt=\"SPACE\"/>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<table>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t<input type=\"image\" onclick=\"\" src=\"images/login_logout.png\" alt=\"LOGIN-LOGOUT\"/>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t<p align=\"center\">OR</p>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t<a href=\"signUp.jsp\">\r\n\t\t\t\t\t\t\t\t\t<img src=\"images/sign_up.png\" alt=\"SIGN UP\" />\r\n\t\t\t\t\t\t\t\t</a>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t\t<img src=\"images/user_icon.png\" alt=\"ICON\"/>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\t\r\n\t\t</table>\r\n\t\t<input type=\"button\" value=\"Add spot\"/><br>\r\n\t\t<input type=\"button\" value=\"Join-leave spot\"/>\r\n\t</div>\r\n\t\r\n\t<table>\r\n\t\t<tr>\r\n\t\t<th>\r\n\t\t</th>\r\n\t\t\t<td>\r\n\t\t\t\t<img src=\"images/blank.png\" alt=\"SPACE\"/>\r\n\t\t\t</td>\r\n\t\t\t<td>\r\n\t\t\t\t<img src=\"images/blank.png\" alt=\"SPACE\"/>\r\n\t\t\t</td>\r\n\t\t\t<td>\r\n\t\t\t\t<img src=\"images/SkateSpot_Logo.png\" alt=\"LOGO\"/>\r\n\t\t\t</td>\r\n\t\t\t<td>\r\n\t\t\t\t<img src=\"images/blank.png\" alt=\"SPACE\"/>\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t</table>\r\n\t\r\n\t<div id=\"view-sect\">\r\n\t\t<table>\r\n\t\t\t<tr>\r\n\t\t\t<th>\r\n\t\t\t</th>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<a href=\"viewSpots.jsp\">\r\n\t\t\t\t\t\t<img src=\"images/view_spot_button.png\" alt=\"VIEW SPOTS\" />\r\n\t\t\t\t\t</a>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<img src=\"images/blank.png\" alt=\"SPACE\"/>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<img src=\"images/blank.png\" alt=\"SPACE\"/>\r\n\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n\t\t\t\t\t<a href=\"viewShops.jsp\">\r\n\t\t\t\t\t\t<img src=\"images/view_shop_button.png\" alt=\"VIEW SHOPS\" />\r\n\t\t\t\t\t</a>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t</div>\r\n\t\r\n</body>\t\r\n</html>");
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
