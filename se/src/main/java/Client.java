/**
 * Created by lywar on 09.08.2017.
 */
public class Client {

    private  String id;
    private final Pet pet;

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Client: " +
                "id: " + id  +
                ", pet: " + pet.getName();
    }

    public Client(String id, Pet pet){
        this.id = id;
        this.pet = pet;
    }
    public void changeId(String id){
        this.id = id;
    }

    public Pet getPet() {
        return pet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;

        Client client = (Client) o;

        if (id != null ? !id.equals(client.id) : client.id != null) return false;
        return pet != null ? pet.equals(client.pet) : client.pet == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (pet != null ? pet.hashCode() : 0);
        return result;
    }
}
