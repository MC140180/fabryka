public class ShippingFactory {
    static SenderInterface getShippingMethod(String shipType) {
        if (shipType.equalsIgnoreCase("letter")) {
            return new SendByLetter();
        } else if (shipType.equalsIgnoreCase("pickupPoint")) {
            return new SendByPaczkomat();
        }
        throw new IllegalArgumentException("Unknown shipment type: " + shipType);
    }
}
