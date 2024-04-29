package edu.cqie.danli;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalancer {
    private static LoadBalancer instance = null;
    private List serverList = null;
    private LoadBalancer() {
        serverList = new ArrayList();
    }
    public static LoadBalancer getInstance() {
        if (instance == null) {
            instance = new LoadBalancer();
        }
        return instance;
    }
    public void addServer(Server server) {
        serverList.add(server);
    }
    public void removeServer(Server server) {
        serverList.remove(server);
    }
    public Server getServer(){
        Random random = new Random();
        int index = random.nextInt(serverList.size());
        return (Server) serverList.get(index);
    }
}
