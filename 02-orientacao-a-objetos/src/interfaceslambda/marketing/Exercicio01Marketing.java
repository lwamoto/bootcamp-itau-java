package interfaceslambda.marketing;

public class Exercicio01Marketing {

    public static void main(String[] args) {

        ServicoMensagem email = new Email();
        email.sendMessage("Promoção Black Friday!");
        email.sendMessage("Dia 10.11.2026!!\n");

        ServicoMensagem sms = new Sms();
        sms.sendMessage("Promoção Black Friday!");
        sms.sendMessage("Dia 11.11.2026!!\n");

        ServicoMensagem whatsapp = new WhatsApp();
        whatsapp.sendMessage("Promoção Black Friday!");
        whatsapp.sendMessage("Dia 12.11.2026!!\n");

        ServicoMensagem socialmedia = new SocialMedia();
        socialmedia.sendMessage("Promoção Black Friday!");
        socialmedia.sendMessage("Dia 13.11.2026!!\n");

    }
}
