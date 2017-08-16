import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by lywar on 09.08.2017.
 */
public class ClinicServlet extends HttpServlet {

    //final List<Pet> pets = new CopyOnWriteArrayList<Pet>();
    final Clinic clinic = new Clinic();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.append(
                "<!DOCTYPE html>" +
                        "<html>"+
                        "<head>"+
                        "<title>Clinic Pets</title>"+
                        "</head>"+
                        "<body>"+
                        "<form action='"+request.getContextPath()+"/'  method='post'>"+
                        "Client's name : <input type = 'text' name='client'><br>"+
                        "<form action='"+request.getContextPath()+"/'  method='post'>"+
                        "Pet's name : <input type = 'text' name='name'>"+
                        "<input type='submit' value='Submit'>"+
                        "</form>"+
                        this.viewPets()+
                        "</body>"+
                        "</html>"
        );
        writer.flush();
    }

    private String viewPets() {
        StringBuilder sb = new StringBuilder();
        //sb.append("<p>Pets</p>");
        sb.append("<table style='border : 1px solid black'>");
        for (Client client : clinic.getClients()){
            sb.append("<th>").append(client.getId()).append("</th>");
            sb.append("<tr><td style='border : 1px solid black'>").append(client.getPet().getName()).append("</td></tr>");
        }
        sb.append("</table>");
        return sb.toString();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // this.pets.add(new Dog (req.getParameter("name")));
        clinic.addClient(new Client(req.getParameter("client"), new Animal(req.getParameter("name"))));

        doGet(req, resp);
    }


}

