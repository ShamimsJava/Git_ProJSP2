package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class x_005fparse_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_var_url_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_x_out_select_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_x_parse_xml_var_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_import_var_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_x_out_select_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_x_parse_xml_var_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_import_var_url_nobody.release();
    _jspx_tagPool_x_out_select_nobody.release();
    _jspx_tagPool_x_parse_xml_var_nobody.release();
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
      response.setContentType("text/html");
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
      out.write("  \n");
      out.write("  \n");
      out.write("\n");
      out.write("<html>  \n");
      out.write("    <head>  \n");
      out.write("        <title>x:parse Tag</title>  \n");
      out.write("    </head>  \n");
      out.write("    <body>  \n");
      out.write("        <h2>Books Info:</h2>  \n");
      out.write("        ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_x_parse_0(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("        <p>First Book title: ");
      if (_jspx_meth_x_out_0(_jspx_page_context))
        return;
      out.write("</p>  \n");
      out.write("        <p>First Book price: ");
      if (_jspx_meth_x_out_1(_jspx_page_context))
        return;
      out.write("</p>  \n");
      out.write("        <p>Second Book title: ");
      if (_jspx_meth_x_out_2(_jspx_page_context))
        return;
      out.write("</p>  \n");
      out.write("        <p>Second Book price: ");
      if (_jspx_meth_x_out_3(_jspx_page_context))
        return;
      out.write("</p>  \n");
      out.write("\n");
      out.write("    </body>  \n");
      out.write("</html>  ");
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

  private boolean _jspx_meth_c_import_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_var_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_0.setPageContext(_jspx_page_context);
    _jspx_th_c_import_0.setParent(null);
    _jspx_th_c_import_0.setVar("bookInfo");
    _jspx_th_c_import_0.setUrl("xml/novels.xml");
    int[] _jspx_push_body_count_c_import_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_0 = _jspx_th_c_import_0.doStartTag();
      if (_jspx_th_c_import_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_0.doFinally();
      _jspx_tagPool_c_import_var_url_nobody.reuse(_jspx_th_c_import_0);
    }
    return false;
  }

  private boolean _jspx_meth_x_parse_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:parse
    org.apache.taglibs.standard.tag.rt.xml.ParseTag _jspx_th_x_parse_0 = (org.apache.taglibs.standard.tag.rt.xml.ParseTag) _jspx_tagPool_x_parse_xml_var_nobody.get(org.apache.taglibs.standard.tag.rt.xml.ParseTag.class);
    _jspx_th_x_parse_0.setPageContext(_jspx_page_context);
    _jspx_th_x_parse_0.setParent(null);
    _jspx_th_x_parse_0.setXml((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bookInfo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_x_parse_0.setVar("output");
    int _jspx_eval_x_parse_0 = _jspx_th_x_parse_0.doStartTag();
    if (_jspx_th_x_parse_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_parse_xml_var_nobody.reuse(_jspx_th_x_parse_0);
      return true;
    }
    _jspx_tagPool_x_parse_xml_var_nobody.reuse(_jspx_th_x_parse_0);
    return false;
  }

  private boolean _jspx_meth_x_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:out
    org.apache.taglibs.standard.tag.rt.xml.ExprTag _jspx_th_x_out_0 = (org.apache.taglibs.standard.tag.rt.xml.ExprTag) _jspx_tagPool_x_out_select_nobody.get(org.apache.taglibs.standard.tag.rt.xml.ExprTag.class);
    _jspx_th_x_out_0.setPageContext(_jspx_page_context);
    _jspx_th_x_out_0.setParent(null);
    _jspx_th_x_out_0.setSelect("$output/books/book[1]/name");
    int _jspx_eval_x_out_0 = _jspx_th_x_out_0.doStartTag();
    if (_jspx_th_x_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_0);
      return true;
    }
    _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_0);
    return false;
  }

  private boolean _jspx_meth_x_out_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:out
    org.apache.taglibs.standard.tag.rt.xml.ExprTag _jspx_th_x_out_1 = (org.apache.taglibs.standard.tag.rt.xml.ExprTag) _jspx_tagPool_x_out_select_nobody.get(org.apache.taglibs.standard.tag.rt.xml.ExprTag.class);
    _jspx_th_x_out_1.setPageContext(_jspx_page_context);
    _jspx_th_x_out_1.setParent(null);
    _jspx_th_x_out_1.setSelect("$output/books/book[1]/price");
    int _jspx_eval_x_out_1 = _jspx_th_x_out_1.doStartTag();
    if (_jspx_th_x_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_1);
      return true;
    }
    _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_1);
    return false;
  }

  private boolean _jspx_meth_x_out_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:out
    org.apache.taglibs.standard.tag.rt.xml.ExprTag _jspx_th_x_out_2 = (org.apache.taglibs.standard.tag.rt.xml.ExprTag) _jspx_tagPool_x_out_select_nobody.get(org.apache.taglibs.standard.tag.rt.xml.ExprTag.class);
    _jspx_th_x_out_2.setPageContext(_jspx_page_context);
    _jspx_th_x_out_2.setParent(null);
    _jspx_th_x_out_2.setSelect("$output/books/book[2]/name");
    int _jspx_eval_x_out_2 = _jspx_th_x_out_2.doStartTag();
    if (_jspx_th_x_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_2);
      return true;
    }
    _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_2);
    return false;
  }

  private boolean _jspx_meth_x_out_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:out
    org.apache.taglibs.standard.tag.rt.xml.ExprTag _jspx_th_x_out_3 = (org.apache.taglibs.standard.tag.rt.xml.ExprTag) _jspx_tagPool_x_out_select_nobody.get(org.apache.taglibs.standard.tag.rt.xml.ExprTag.class);
    _jspx_th_x_out_3.setPageContext(_jspx_page_context);
    _jspx_th_x_out_3.setParent(null);
    _jspx_th_x_out_3.setSelect("$output/books/book[2]/price");
    int _jspx_eval_x_out_3 = _jspx_th_x_out_3.doStartTag();
    if (_jspx_th_x_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_3);
      return true;
    }
    _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_3);
    return false;
  }
}
