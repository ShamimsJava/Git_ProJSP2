package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"STYLE/style.css\" type=\"text/css\"/>\n");
      out.write("        <title>Navigation JSP Pages</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <p>I use Apache-tomcat-8.5.24, Java EE 5, Jstl-1.2, Standard-1.1.2 and NetBeans IDE 8.2</p><hr>\n");
      out.write("        <h1>Navigation for all jsp pages</h1>\n");
      out.write("        <h3><a href=\"date.jsp\">Listing 1-2.date.jsp</a></h3>\n");
      out.write("        <h3><a href=\"template_text.jsp\">Listing 1-3.template_text.jsp</a></h3>\n");
      out.write("        <h3><a href=\"Header.jsp\">Listing 1-4.Header.jsp</a></h3>\n");
      out.write("        <h3><a href=\"Footer.jsp\">Listing 1-5.Footer.jsp</a></h3>\n");
      out.write("        <h3><a href=\"Content.jsp\">Listing 1-6.Content.jsp</a></h3>\n");
      out.write("        <h3><a href=\"MoreContent.jsp\">Listing 1-7.MoreContent.jsp</a></h3>\n");
      out.write("        <h3><a href=\"dateScriptlet.jsp\">Listing 1-8.dateScriptlet.jsp</a></h3>\n");
      out.write("        <h3><a href=\"dateBean.jsp\">Listing 1-10.dateBean.jsp</a></h3>\n");
      out.write("        <h3><a href=\"dateBean_getProperty.jsp\">Listing 1-11.dateBean_getProperty.jsp</a></h3>\n");
      out.write("        <h3><a href=\"dateBean_setProperty.jsp\">Listing 1-12.dateBean_setProperty.jsp</a></h3>\n");
      out.write("        \n");
      out.write("        <hr><p>&copy;All rights reserved by Md. Shamim Sarker | 2018 | shamimsjava@gmail.com | 01723795366</p>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
