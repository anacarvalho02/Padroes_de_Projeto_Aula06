public class EmailNotificacao implements Notificacao {
 
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("=== E-MAIL ===");
        System.out.println("Para: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
        System.out.println("Status: E-mail enviado com sucesso!");
        System.out.println();
    
    }
    
}
