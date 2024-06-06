public class Main {
    public static void main(String[] args) {
        SenderInterface ship = ShippingFactory.getShippingMethod("letter");
        ship.send();
    }
}