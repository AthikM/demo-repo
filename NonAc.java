import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class NonAc implements Compartment{
    String type;
    ArrayList<ArrayList<Person>> seat;
    Queue<Person> racQueue;
    Queue<Person> waitQueue;

    NonAc()
    {
        type = "AC Compartment";
        seat = new ArrayList<>(3);
        seat.add(new ArrayList<>(20));
        seat.add(new ArrayList<>(20));
        seat.add(new ArrayList<>(20));
        racQueue = new ArrayDeque<>();
        waitQueue = new ArrayDeque<>();
    }

    @Override
    public void bookTicket(Person person) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void cancelTicket(Person person) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void printCompartment() {
        // TODO Auto-generated method stub
        
    }
    


}
