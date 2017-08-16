import java.util.List;

/**
 * Created by lywar on 09.08.2017.
 */
public class main {
    public static void main(String[] args) {
        Clinic clinic = new Clinic();

        clinic.addClient(new Client("Danil", new Dog("Jessy")));
        clinic.addClient(new Client("Helen", new Cat("Elis")));
        clinic.addClient( new Client("Ura", new Dog("Terry")));

        clinic.addClient( new Client("Danil", new Cat("Elis")));
        System.out.println("Clients by Pet name Elis:");
        System.out.println(clinic.findClientsByPetName("Elis"));
        System.out.println("All Clients:");
        for( Client client : clinic.getClients()){
            System.out.println(client);
        }
        System.out.println("Clients by ID: ");
        List<Client> danil =  clinic.findClientsById("Danil");

        System.out.println(danil);
        for (Client client: danil){
            client.getPet().makeSound();
        }

    }
}
