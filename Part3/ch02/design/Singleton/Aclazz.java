package Part3.ch02.design.Singleton;

public class Aclazz {
    private SocketClient socketClient;
    public Aclazz()
    {
       // 이렇게 못함 this.socketClient=new SocketClient(); //
        this.socketClient=SocketClient.getInstance();

    }
    public SocketClient getSocketClient()
    {
        return this.socketClient;
    }
}
