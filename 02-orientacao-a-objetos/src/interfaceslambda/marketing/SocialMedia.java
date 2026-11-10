package interfaceslambda.marketing;

public class SocialMedia implements ServicoMensagem {
    @Override
    public void sendMessage(String msg) {
        System.out.println("SocialMedia: "  + msg );
    }
}
