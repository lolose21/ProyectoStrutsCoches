<%@page  contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>


<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="includes/webhead.jsp"/>
        <title>Plantilla</title>
    </head>
    <body>
        <jsp:include page="includes/webmenu.jsp"/>
    <main role="main" class="container">

        
          <h1>ELIMINAR COCHE</h1>
          <html:form action="/ActionEliminarCoche">
              <label>Numero Coche</label>
              <html:text property="id"/>
              <button type="submit">
                  ELIMINAR
              </button>
          </html:form>
          
    </main><!-- /.container -->
    <jsp:include page="includes/webfooter.jsp"/>
    </body>
</html>
