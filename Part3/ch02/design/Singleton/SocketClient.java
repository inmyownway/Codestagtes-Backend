package Part3.ch02.design.Singleton;

public class SocketClient {
    private static SocketClient socketClient=null;

    private SocketClient()
    {

    }
    public static SocketClient getInstance(){

        if(socketClient==null)
        {
            socketClient = new SocketClient();
        }
        return socketClient;
    }
    public void connect()
    {
        System.out.println("connect");
    }
}
