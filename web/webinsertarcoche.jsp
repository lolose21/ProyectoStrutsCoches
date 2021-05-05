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

        
          <h1>NUEVO COCHE</h1>
          <html:form action="/ActionInsertarCoche">
              <label>NUMERO COCHE</label>
              <html:text property="idcoche" styleClass="form-control"/><br/>
              <label>MARCA</label>
              <html:text property="marca" styleClass="form-control"/><br/>
              <label>MODELO</label>
              <html:text property="modelo" styleClass="form-control"/><br/>
              <label>CONDUCTOR</label>
              <html:text property="conductor" styleClass="form-control"/><br/>
              <label>IMAGEN</label>
              <html:image property="imagen" styleClass="form-control"/><br
                  <button type="submit" class="btn btn-info">
                  INSERTAR COCHE
              </button>
          </html:form>
        
    </main><!-- /.container -->
    <jsp:include page="includes/webfooter.jsp"/>
    </body>
</html>
