public class SmsNotificacao implements Notificacao {

    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("=== SMS ===");
        System.out.println("Para: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
        System.out.println("Status: SMS enviado com sucesso!");
        System.out.println();
    
    }
    
}


