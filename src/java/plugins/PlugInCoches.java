package plugins;

import java.rmi.ServerException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import models.Coches;
import org.apache.struts.action.ActionServlet;
import org.apache.struts.action.PlugIn;
import org.apache.struts.config.ModuleConfig;
import repositories.RepositoryCoches;

public class PlugInCoches implements PlugIn {

    RepositoryCoches repo;

    public PlugInCoches() {
        this.repo = new RepositoryCoches();
    }

    @Override
    public void destroy() {
    }

    @Override
    public void init(ActionServlet servlet, ModuleConfig config) throws ServletException {
        try {
            ArrayList<Coches> coche = this.repo.getCoches();
            servlet.getServletContext().setAttribute("LISTACOCHES", coche);
        } catch (SQLException ex) {
            throw new ServletException("Error SQL " + ex);

        }

    }

}
