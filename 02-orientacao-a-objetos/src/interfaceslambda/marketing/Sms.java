package interfaceslambda.marketing;

public class Sms implements ServicoMensagem{
    @Override
    public void sendMessage(String msg) {
        System.out.println("Sms: " + msg );
    }
}
