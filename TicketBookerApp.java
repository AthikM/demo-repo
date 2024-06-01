import java.util.ArrayList;

public class TicketBookerApp {
    Train[] trains;
    ArrayList<Person> passenger;

    TicketBookerApp()
    {
        trains = new Train[10];

        for(int i = 0; i < 10; i++)
        trains[i] = new Train();
        passenger = new ArrayList<>();
    }

    void bookTicket(Person person)
    {
        trains[person.getRequest().getTrainNo()].bookTicket(person);
    }

    void cancelTicket(int customerID)
    {
        Person temp = null;
        for(Person person : passenger)
        if(person.getId() == customerID)
        temp = person;

        trains[temp.getRequest().getTrainNo()].cancelTicket(temp);
    }
}
