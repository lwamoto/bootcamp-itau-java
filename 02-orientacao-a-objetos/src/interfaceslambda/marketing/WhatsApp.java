package interfaceslambda.marketing;

public class WhatsApp implements ServicoMensagem{
    @Override
    public void sendMessage(String msg) {
        System.out.println("WhatsApp: " + msg );
    }
}
