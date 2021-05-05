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
          <h1>Menu Coches</h1>
          <table border="1">
              <thead>
                  <tr>
                      <th>IDCOCHE</th>
                      <th>MARCA</th>
                      <th>MODELO</th>
                      <th><html:link href="webdetallescoche.jsp">
                              DETALLES
                      </html:link></th>
                  </tr>
              </thead>
              <tbody>
                  <logic:iterate name="LISTACOCHES" id="coch">
                      <tr>
                          <td>
                              <bean:write name="coch" property="idcoche"/>
                          </td>
                          <td>
                              <bean:write name="coch" property="marca"/>
                          </td>
                          <td>
                              <bean:write name="coch" property="modelo"/>
                          </td>
                          <td><html:link href="webdetallescoche.jsp?=idcoche">
                              DETALLES
                      </html:link></td>
                          
                              <html:link action="/ActionModificarCoche"
                                         paramId="id"
                                         paramName="">
                                  MODIFICAR COCHE
                                         </html:link>
                                         <html:link action="/ActionEliminarCoche">
                                             Eliminar
                                         </html:link>
                      </tr>
                  </logic:iterate>
              </tbody>
          </table>
        </div>
    </main><!-- /.container -->
    <jsp:include page="includes/webfooter.jsp"/>
    </body>
</html>
