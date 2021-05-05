package controllers;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Coches;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import repositories.RepositoryCoches;

public class ActionEliminarCoche extends org.apache.struts.action.Action {

    RepositoryCoches repo;

    public ActionEliminarCoche() {
        this.repo = new RepositoryCoches();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        String dato = request.getParameter("id");
        int id = Integer.parseInt(dato);
        this.repo.eliminarCoche(id);
        ArrayList<Coches> coches = this.repo.getCoches();
        request.setAttribute("LISTACOCHES", coches);
        return mapping.findForward("webmenucoches");
    }
}
