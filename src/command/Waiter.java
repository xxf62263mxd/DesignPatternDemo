package command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    private List<Command> list = new ArrayList<>();

    public void addCommand(Command command){
        if(command instanceof BakeChickenWingCommand){
            System.out.println("拒绝烤鸡翅请求，鸡翅没了");
        }else{
            System.out.println("接收到烤羊肉串请求");
            list.add(command);
        }
    }

    public void removeCommand(Command command){
        System.out.println("撤销了烤羊肉串请求");
        list.remove(command);
    }

    public void notifyAllCommand(){
        for(Command c:list){
            c.execute();
        }
    }

}
