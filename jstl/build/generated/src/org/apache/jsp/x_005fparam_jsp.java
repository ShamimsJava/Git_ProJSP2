package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class x_005fparam_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_var_url_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_x_param_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_x_transform_xslt_xml;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_import_var_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_x_param_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_x_transform_xslt_xml = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_import_var_url_nobody.release();
    _jspx_tagPool_x_param_value_name_nobody.release();
    _jspx_tagPool_c_set_var.release();
    _jspx_tagPool_x_transform_xslt_xml.release();
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
      out.write("        <title>x:transform Tag</title>  \n");
      out.write("    </head>  \n");
      out.write("    <body>  \n");
      out.write("        <h3>Novels Information:</h3>  \n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("    ");
      if (_jspx_meth_x_transform_0(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("\n");
      out.write("</body>  \n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("xmltext");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_set_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_set_0.doInitBody();
      }
      do {
        out.write("  \n");
        out.write("        <books>  \n");
        out.write("            <book>  \n");
        out.write("                <name>Three mistakes of my life</name>  \n");
        out.write("                <author>Chetan Bhagat</author>  \n");
        out.write("                <price>200</price>  \n");
        out.write("            </book>  \n");
        out.write("            <book>  \n");
        out.write("                <name>Tomorrow land</name>  \n");
        out.write("                <author>Brad Bird</author>  \n");
        out.write("                <price>1000</price>  \n");
        out.write("            </book>  \n");
        out.write("            <book>  \n");
        out.write("                <name>Wings of fire</name>  \n");
        out.write("                <author>Dr. APJ Abdul Kalam</author>  \n");
        out.write("                <price>500</price>  \n");
        out.write("            </book>  \n");
        out.write("        </books>  \n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_set_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_import_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_var_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_0.setPageContext(_jspx_page_context);
    _jspx_th_c_import_0.setParent(null);
    _jspx_th_c_import_0.setUrl("xml/param.xsl");
    _jspx_th_c_import_0.setVar("xslt");
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

  private boolean _jspx_meth_x_transform_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:transform
    org.apache.taglibs.standard.tag.rt.xml.TransformTag _jspx_th_x_transform_0 = (org.apache.taglibs.standard.tag.rt.xml.TransformTag) _jspx_tagPool_x_transform_xslt_xml.get(org.apache.taglibs.standard.tag.rt.xml.TransformTag.class);
    _jspx_th_x_transform_0.setPageContext(_jspx_page_context);
    _jspx_th_x_transform_0.setParent(null);
    _jspx_th_x_transform_0.setXml((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${xmltext}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_x_transform_0.setXslt((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${xslt}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_x_transform_0 = _jspx_th_x_transform_0.doStartTag();
    if (_jspx_eval_x_transform_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_x_transform_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_x_transform_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_x_transform_0.doInitBody();
      }
      do {
        out.write("  \n");
        out.write("        ");
        if (_jspx_meth_x_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_x_transform_0, _jspx_page_context))
          return true;
        out.write("  \n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_x_transform_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_x_transform_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_x_transform_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_transform_xslt_xml.reuse(_jspx_th_x_transform_0);
      return true;
    }
    _jspx_tagPool_x_transform_xslt_xml.reuse(_jspx_th_x_transform_0);
    return false;
  }

  private boolean _jspx_meth_x_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_x_transform_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:param
    org.apache.taglibs.standard.tag.rt.xml.ParamTag _jspx_th_x_param_0 = (org.apache.taglibs.standard.tag.rt.xml.ParamTag) _jspx_tagPool_x_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.xml.ParamTag.class);
    _jspx_th_x_param_0.setPageContext(_jspx_page_context);
    _jspx_th_x_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_x_transform_0);
    _jspx_th_x_param_0.setName("bgColor");
    _jspx_th_x_param_0.setValue(new String("yellow"));
    int _jspx_eval_x_param_0 = _jspx_th_x_param_0.doStartTag();
    if (_jspx_th_x_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_param_value_name_nobody.reuse(_jspx_th_x_param_0);
      return true;
    }
    _jspx_tagPool_x_param_value_name_nobody.reuse(_jspx_th_x_param_0);
    return false;
  }
}
