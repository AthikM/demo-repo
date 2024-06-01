import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class AC implements Compartment{
    String type;
    ArrayList<ArrayList<Person>> seat;
    Queue<Person> racQueue;
    Queue<Person> waitQueue;

    AC()
    {
        type = "AC Compartment"; 
        seat = new ArrayList<>(3); // all seat
        seat.add(new ArrayList<>(20)); // low
        seat.add(new ArrayList<>(20)); // mid
        seat.add(new ArrayList<>(20)); // up
        racQueue = new ArrayDeque<>();
        waitQueue = new ArrayDeque<>();
    }

    @Override
    public void bookTicket(Person person) {
        int type = person.getRequest().getType();

        if(seat.get(type).size() <= 20)
        {
            seat.get(type).add(person);
            person.getRequest().setStatus(new Status(true, this.type));
        }else if(racQueue.size() < 10){
            racQueue.add(person);
            person.getRequest().setStatus(new Status(true, "RAC"));
        }else if(waitQueue.size() < 10)
        {
            waitQueue.add(person);
            person.getRequest().setStatus(new Status(true, "Waiting List"));
        }else{
            person.getRequest().setStatus(new Status(false, "No Seat available"));
        }
       
    }

    @Override
    public void cancelTicket(Person person) {
        int type = person.getRequest().getType();
        
    }

    @Override
    public void printCompartment() {
        // TODO Auto-generated method stub
        
    }

    


}
