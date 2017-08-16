import java.util.ArrayList;
import java.util.List;

/**
 * Created by lywar on 09.08.2017.
 */
public class Clinic {

    private final List<Client> clients;

    public Clinic (){
        this.clients = new ArrayList<>();

    }

    public void addClient( final Client client){
        this.clients.add(client);
    }


     public List findClientsByPetName(final String name){

       List<Client> clientsByName = new ArrayList<Client>();
            for (Client client: clients){
                if (client.getPet().getName().equals(name)){
                    clientsByName.add(client);

                }
            }
         return  clientsByName;
     }

    public List<Client> getClients() {
        return clients;
    }

    public List findClientsById(String id){

        List<Client> clientsById = new ArrayList<Client>();
        for (Client client: clients){
            if (client.getId().equals(id)){
                clientsById.add(client);

            }
        }
        return  clientsById;
    }
}
