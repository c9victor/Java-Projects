import java.util.HashMap;

/*
 * Since we want our program to be notified when modifications are made from
 * other programs, the Observer Pattern would be perfect. The file with the
 * list would act as a Subject and this Account class would be one of its 
 * Observers.
 */

/*
 * Victor C Thompson
 */
public class Account {
    private volatile static Account unique;
    private HashMap<String, String> map;
    
    private Account() {
        map = new HashMap<String, String>();
    }
    
    public static Account getInstance() {
        if (unique == null) {
            synchronized (Account.class) {
                if (unique == null) {
                    unique = new Account();
                }
            }
        }
        
        return unique;
    }
    
    public void add(String account, String password) {
        map.put(account, password);
    }
    
    public void remove(String account) {
        if (map.containsKey(account)) {
            map.remove(account);
        }
    }
    
    public String get(String account) {
        if (map.containsKey(account)) {
            return map.get(account);
        }
        else {
            return null;
        }
    }
 }
