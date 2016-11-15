/**
 * Created by jlaba on 15.11.2016.
 */
public class Order_Main {
    public static void main(String [] args){
        Order myOrder = new Order();
        myOrder.setDeliveryStrategy(new PostDeliveryStrategy());
        myOrder.setPaymentStrategy(new PayPalPaymentStrategy());
        Bouquet newBucket = new Bouquet();
        Spec cactusSpec = new CactusSpec(12,34);
        Cactus flower1 = new Cactus((CactusSpec)cactusSpec, FlowerShape.STEM);

        newBucket.add(flower1);
        //newBucket.add(flower2);
        myOrder.addItem(newBucket);
        Item item = newBucket;
        item = new PaperDecorator(item);
        item = new RibbonDecorator(item);
        item = new BasketDecorator(item);
        System.out.println(item.cost());
        myOrder.proccessOrder();
        System.out.println("Total price: ");
        System.out.println(myOrder.calculateTotalPrice());
    }
}