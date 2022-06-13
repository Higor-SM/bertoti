package observer;
import java.util.ArrayList;
import java.util.List;
public class SetEvent{
    private List<observer> channels = new ArrayList<observer>();
    public void inscrever(observer channel){
        channels.add(channel);
    }
    public void desinscrever(observer channel){
        channels.remove(channel);
    }
    public void notificar(observer literarygenres, String message){
        for(observer channel:channels){
            if(channels.getClass()==literarygenres.getClass())
            channel.atualizar(message);
        }
    }
}