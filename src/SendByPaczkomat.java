public class SendByPaczkomat implements SenderInterface{

    @Override
    public String send() {
        System.out.println("Wyslano na paczkomat");
        return "wyslano na paczkomat";
    }
}
