package strategy;
public class Application {
    public static void public static void main(String[] args) {
        Animal coelho = new Animal();
        coelho.setEspecie(new EspecieComum());
        coelho.selecionarEspecie();

        Animal cheetah = new Animal();
        cheetah.setEspecie(new EspecieRara());
        cheetah.selecionarEspecie();

        coelho.setEspecie(new EspecieRara());
        coelho.selecionarEspecie();

        cheetah.setEspecie(new EspecieComum());
        cheetah.selecionarEspecie();
    }
}
