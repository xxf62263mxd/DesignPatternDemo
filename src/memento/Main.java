package memento;

/**
 *
 * 备忘录模式
 *
 * 可以用于保存对象的部分状态
 *
 *
 */
public class Main {
    public static void main(String[] args) {

        Player player = new Player();

        player.readyFight();
        player.showState();

        RecordManager recordManager = new RecordManager();
        recordManager.setRecord(player.saveRecord());

        player.fight();
        player.showState();

        player.loadRecord(recordManager.getRecord());
        player.showState();


    }
}
