import java.util.ArrayList;
import java.util.List;

/**
 * Created by lywar on 09.08.2017.
 */
public class Clinic {

    private final Client[] clients;

    public Clinic (final int size){
        this.clients = new Client[size];

    }

    public void addClient(final int position, final Client client){
        this.clients[position] = client;
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

    public Client[] getClients() {
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
