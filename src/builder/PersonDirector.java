package builder;

public class PersonDirector {


    public void buildPerson(PersonBuilder personBuilder){

        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildHand();
        personBuilder.buildFoot();

    }

}
