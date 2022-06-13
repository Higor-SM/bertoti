package observer;
public class Loja {
    public SetEvent evento;
    public Loja(){
        evento = new SetEvent();
    }
    public void escolhaaventura(String message){
        evento.notificacao(new Aventura(), message);
    }
    public void escolhaacao(String message){
        evento.notificacao(new Ação(), message);
    }
    public void escolharpg(String message){
        evento.notificacao(new RPG(), message);
    }
}
