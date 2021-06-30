package factory.abstractfactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DataAccess {

    private static String db;
    private static final String PREFIX = "factory.abstractfactory.";
    private static final String SUFFIX_SELECT = "Select";
    private static final String SUFFIX_Update = "Update";

    static {
        try(InputStream input= DataAccess.class.getResourceAsStream("application.properties")){

            Properties properties = new Properties();
            properties.load(input);
            db = properties.getProperty("db","Mysql");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ISelect createSelect(){

        ISelect ret = null;

        try {
            Class c = Class.forName(PREFIX+db+SUFFIX_SELECT);
            ret = (ISelect) c.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return ret;
    }

    public static IUpdate createUpdate(){
        IUpdate ret = null;

        try {
            Class c = Class.forName(PREFIX+db+SUFFIX_Update);
            ret = (IUpdate) c.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return ret;
    }

}
