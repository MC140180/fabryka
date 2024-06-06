public class SendByLetter implements SenderInterface{

    @Override
    public String send() {
        System.out.println("Wyslano poczta");
        return "wyslano pocztą";
    }
}