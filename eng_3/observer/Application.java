package observer;
public class Application{
    public static void main(String[] args) {
        Loja JorgesGaming = new Loja();

        JorgesGaming.event.inscrever(new Ação());
        JorgesGaming.event.inscrever(new Ação());
        JorgesGaming.event.desinscrever(new Ação());
        JorgesGaming.event.inscrever(new Aventura());
        JorgesGaming.event.inscrever(new Aventura());
        JorgesGaming.event.desinscrever(new Aventura());
        JorgesGaming.event.inscrever(new RPG());

        JorgesGaming.escolhaacao("tokyoaction Novo Jogo");
        JorgesGaming.escolhaaventura("bravureadventure Novo Jogo");
        JorgesGaming.escolharpg("dungeons,dungeons, and more dungeons Novo Jogo");
    }
}