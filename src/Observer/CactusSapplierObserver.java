package Observer;

import Decorator.Item;
import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;


/**
 * Created by jlaba on 21.11.2016.
 */
public class CactusSapplierObserver implements Observer {
    /**
     * This is Observer pattern which notify, how many cactuses you will be delivered
     * It implements built-in class
     */
    @Override
    public void update(Observable o, Object arg) {
        int count = 0;
        LinkedList<Item> bouquet = (LinkedList)arg;
        for(int i = 0; i < ((LinkedList) arg).size(); i++){
            int x = bouquet.get(i).searchFlower("Cactus");
            count += x;

        }System.out.println("You will be delivered " + count + " cactuses");
    }
}






