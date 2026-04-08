public class PushNotificacao implements Notificacao {
 
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("=== PUSH NOTIFICATION ===");
        System.out.println("Dispositivo: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
        System.out.println("Status: Push Notification enviada com sucesso!");
        System.out.println();
    
    }
    
}
