package observer;
public class Ação implements observer{
    public void update(String message){
        System.out.println(message+"de Ação");
    }
}
