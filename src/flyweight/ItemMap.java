package flyweight;

import java.util.HashMap;

public class ItemMap {

    private static HashMap<String,Item> map = new HashMap<>();

    static {
        map.put("apple",new AppleItem());
        map.put("banana",new BananaItem());
    }

    public static Item getItem(String name){
        return map.get(name);
    }


}

