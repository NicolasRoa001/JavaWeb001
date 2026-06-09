package controllers;
import clases.DetalleTrabajador;
import clases.TrabajadorDescuento;
import clases.TrabajadorPorcentaje;
import daos.TrabajadorDao;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class TrabajadorController extends HttpServlet {
    private final TrabajadorDao tdao = new TrabajadorDao();
    private final String viewIndex = "/views/Trabajadores/index.jsp";
    private final String viewDetalle = "/views/Trabajadores/Detalles.jsp";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        
        switch (action){
            case "descuentos":
                descuentos(request,response);
                break;
            case "porcentajes":
                porcentajes(request,response);
                break;
            case "index":
                index(request,response);
            case "Detalle":
                Detalle(request, response);
                break;
            default:
                break;
        }
    }
            
    protected void descuentos(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String run1 = "16.532.759-7";
        String run2 = "17.553.697-5";
        String run3 = "12.594.552-5";
        
       ArrayList<TrabajadorDescuento> datos = tdao.descuentosLegales(run1, run2, run3);
        System.out.println(datos.get(0).toString());
           
    }
    
    
    protected void porcentajes(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
       ArrayList<TrabajadorPorcentaje> datos = tdao.DescuentosGastos();
        System.out.println(datos.get(0).toString());
           
    }
    
    protected void index(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
         ArrayList<DetalleTrabajador> datos = tdao.obtenerDetalle();
         System.out.println("Total: "+datos.size());
         request.setAttribute("trabajadores", datos);
         request.getRequestDispatcher(viewIndex).forward(request, response);

    }
    
        protected void Detalle(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
         
         String id = request.getParameter("id");
         int cod = Integer.parseInt(id);
         ArrayList<TrabajadorDescuento> datos = tdao.itemsSueldoDao(cod);
         System.out.println("Total: "+datos.size());
         request.setAttribute("trabajadores", datos);
         request.getRequestDispatcher(viewDetalle).forward(request, response);

    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
