package composite;

public class HRDepartment implements Company{

    private String name;

    public HRDepartment(String name) {
        this.name = name;
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void show() {
        System.out.println(name);
    }

    @Override
    public void lineOfDuty() {

    }
}
