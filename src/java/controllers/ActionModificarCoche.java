package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Coches;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import repositories.RepositoryCoches;

public class ActionModificarCoche extends org.apache.struts.action.Action {

    RepositoryCoches repo;

    public ActionModificarCoche() {
        this.repo = new RepositoryCoches();
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String dato = request.getParameter("id");
        if (dato != null) {

            int idcoche = Integer.parseInt(dato);
            Coches car = this.repo.buscarCoche(idcoche);
            request.setAttribute("COCHE", car);
            return mapping.findForward("");

        } else {
            DynaActionForm f = (DynaActionForm) form;
            String data = f.get("idcoche").toString();
            int id = Integer.parseInt(data);
            String marca = f.get("marca").toString();
            String modelo = f.get("modelo").toString();
            String conductor = f.get("conductor").toString();

        }
        return null;
    }
}
