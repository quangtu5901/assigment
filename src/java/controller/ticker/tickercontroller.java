package controller.ticker;

import controller.BaseAuthController;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ticker;
import controller.viewServlet;
import dal.AccountDBContext;
import model.Account;
import model.CEX;
import model.JsonReader;

/**
 *
 * @author thand
 */
public class tickercontroller extends BaseAuthController {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<ticker> list = viewServlet.readderjson(request, response);
        String sendeail = request.getParameter("sendeail") + "";
        String crate = request.getParameter("changerate2") + "";
        String volume = request.getParameter("vol2") + "";
        String elastedtime = (String) request.getParameter("elastedtime");
        if(sendeail!=null || sendeail.trim().length()!=0){
            request.getSession().setAttribute("sendeail", sendeail);
        }
        if (elastedtime != null || crate.trim().length() != 0) {
            request.getSession().setAttribute("elastedtime", elastedtime);
        }
        if (crate != null || !crate.trim().isEmpty()) {
            request.getSession().setAttribute("crate", crate);
        }
        if (volume != null || !volume.trim().isEmpty()) {
            request.getSession().setAttribute("volume", volume);
        }
        crate = (String) request.getSession().getAttribute("crate") + "";
        volume = (String) request.getSession().getAttribute("volume") + "";
        boolean send = sendeail.equals("yes");
        Account a = (Account) request.getSession().getAttribute("Account");
        AccountDBContext adbc = new AccountDBContext();
        String x = (String) request.getSession().getAttribute("elastedtime")+"";
        int t = Integer.parseInt(x.trim());
        System.out.println(t);
        adbc.updatefilter(crate, volume, t, send, a.getEmail());
        list = viewServlet.fitle(request, response, list, crate, volume);
        request.setAttribute("list", list);
        request.setAttribute("a", "a");
        request.getRequestDispatcher("view/home.jsp").forward(request, response);
    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Account a = (Account) request.getSession().getAttribute("Account");
        ArrayList<ticker> list = JsonReader.getliststickerBinanceSpot();
        CEX cexs = new CEX(1, "Binance", "Spot");
        request.getSession().setAttribute("cexs", cexs);
        request.getSession().setAttribute("list", list);
        list = viewServlet.fitle(request, response, list, a.getChangerate(), a.getVolume());
        request.getSession().setAttribute("elastedtime", a.getTime());
        request.getSession().setAttribute("crate", a.getChangerate());
        request.getSession().setAttribute("volume", a.getVolume());
        request.setAttribute("a", "a");
        request.setAttribute("list", list);
        request.getRequestDispatcher("view/home.jsp").forward(request, response);
    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     *
     * @return
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
