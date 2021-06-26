package decorator;

public abstract class Finery extends Person{

    private Person component;

    public Finery(Person component){
        this.component = component;
    }



    public void setComponent(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if(component != null)component.show();
    }
}

