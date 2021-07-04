package flyweight;

public class ItemStack {

    private String itemName;
    private Item item;
    private int count;
    private String username;

    public ItemStack(String itemName,String username,int count) {
        this.itemName = itemName;
        this.item = ItemMap.getItem(itemName);
        this.count = count;
        this.username = username;
    }

    public void use(){
        item.use(username);
        count--;
        System.out.println("还剩"+count+"个");
    }
}
