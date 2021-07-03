package composite;

import java.util.ArrayList;
import java.util.List;

public class Subsidiary implements Company{

    private List<Company> son = new ArrayList<>();
    private String name;

    public Subsidiary(String name){
        this.name = name;
    }

    @Override
    public void add(Company company) {
        son.add(company);
    }

    @Override
    public void remove(Company company) {
        son.remove(company);
    }

    @Override
    public void show() {
        System.out.println(name);
        for(Company c:son){
            c.show();
        }
    }

    @Override
    public void lineOfDuty() {
        for(Company c:son){
            c.lineOfDuty();
        }
    }
}
