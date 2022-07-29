package Part3.ch02.design.Singleton;

public class Bclazz {
    private SocketClient socketClient;
    public Bclazz()
    {
        // 이렇게 못함 this.socketClient=new SocketClient(); //
        this.socketClient=SocketClient.getInstance();

    }
    public SocketClient getSocketClient()
    {
        return this.socketClient;
    }
}
