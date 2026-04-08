public class Main {
 
    public static void main(String[] args) {
 
        System.out.println("===================================================");
        System.out.println("  SISTEMA DE NOTIFICACOES");
        System.out.println("===================================================");
        System.out.println();
 
        
        NotificacaoFactory emailFactory = new EmailNotificacaoFactory();
        emailFactory.enviarNotificacao("cliente@email.com",
                "Sua compra foi confirmada! Obrigado por comprar conosco.");
 

        NotificacaoFactory smsFactory = new SmsNotificacaoFactory();
        smsFactory.enviarNotificacao("+55 64 1234 - 5678",
                "Seu pedido #1234 saiu para entrega.");
 
        
        NotificacaoFactory pushFactory = new PushNotificacaoFactory();
        pushFactory.enviarNotificacao("device-token-abc123",
                "Voce tem uma nova mensagem no app!");
 
        System.out.println("===================================================");
        System.out.println("  Todas as notificacoes foram enviadas com sucesso!");
        System.out.println("===================================================");
    
    }
    
}
