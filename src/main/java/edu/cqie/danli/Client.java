package edu.cqie.danli;

public class Client {
    public static void main(String[] args) {
        LoadBalancer balancer1,balancer2,balancer3,balancer4;
        balancer1 = LoadBalancer.getInstance();
        balancer2 = LoadBalancer.getInstance();
        balancer3 = LoadBalancer.getInstance();
        balancer4 = LoadBalancer.getInstance();

        if(balancer1==balancer2&&balancer2==balancer3&&balancer3==balancer4){
            System.out.println("服务器负载均衡器具有唯一性");
        }

        Server server1 = new Server();
        server1.setIp("127.0.0.1");
        server1.setAdd("127.0.0.12");
        server1.setUrl("123445666");
        server1.setUsername("gw");
        server1.setPassword("123456");
        server1.setWeight(1);

         Server server2 = new Server();
         server2.setIp("127.0.0.2");
         server2.setAdd("127.0.0.2");
         server2.setUrl("123445666");
         server2.setUsername("gw");
         server2.setPassword("123456");
         server2.setWeight(2);

         Server server3 = new Server();
         server3.setIp("127.0.0.3");
         server3.setAdd("127.0.0.3");
         server3.setUrl("123445666");
         server3.setUsername("gw");
         server3.setPassword("123456");
         server3.setWeight(3);

         Server server4 = new Server();
         server4.setIp("127.0.0.4");
         server4.setAdd("127.0.0.4");
         server4.setUrl("123445666");
         server4.setUsername("gw");
         server4.setPassword("123456");
         server4.setWeight(4);

         balancer1.addServer(server1);
         balancer2.addServer(server2);
         balancer3.addServer(server3);
         balancer4.addServer(server4);

        for(int i = 0;i<10;i++){
            Server server = balancer1.getServer();
            System.out.println("分发请求至服务器："+server);
        }
    }
}
