import store.UserCache;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lywar on 16.08.2017.
 */
public class UserViewServlet extends HttpServlet{

    private final UserCache USER_CACHE = UserCache.getInstance();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("users", this.USER_CACHE.values());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/views/user/UserVeiw.jsp");
        dispatcher.forward(req,resp);
    }
}
