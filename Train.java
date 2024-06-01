public class Train {
    static int count = 0;
    int id;

    Compartment[] compartments;

    Train()
    {
        compartments = new Compartment[2];
        compartments[0] = new AC();
        compartments[1] = new NonAc();
    }

    void bookTicket(Person person)
    {
        compartments[person.getRequest().getBirth()].bookTicket(person);
    }

    void cancelTicket(Person person)
    {
        compartments[person.getRequest().getBirth()].bookTicket(person);
    }

    void printTrain()
    {
        for(Compartment compartment : compartments)
        compartment.printCompartment();
    }

}
