package interfaceslambda.marketing;

public class Email implements ServicoMensagem{

    @Override
    public void sendMessage(String msg){
        System.out.println("Email: " + msg );
    }
}
