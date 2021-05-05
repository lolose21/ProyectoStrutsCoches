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

        <div class="starter-template">
          <h1>MODIFICAR COCHES</h1>
          <html:link action="/ActionModificarCoche">
              <html:hidden property="idcoche"/>
              <label>Marca</label>
              <html:text property="marca" value="${COCHE.marca}"/><br/>
              <label>Modelo</label>
              <html:text property="modelo" value="${COCHE.modelo}"/><br/>
              <label>Conductor</label>
              <html:text property="conductor" value="${COCHE.conductor}"/><br/>
              <label>Imagen</label>
          </html:link>
        </div>
    </main><!-- /.container -->
    <jsp:include page="includes/webfooter.jsp"/>
    </body>
</html>
