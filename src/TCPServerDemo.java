import java.net.ServerSocket;
import java.net.Socket;

//TCP �����
public class TCPServerDemo {

	public static void main(String[] args) throws Exception{  
        //�������20006�˿ڼ����ͻ��������TCP����  
        ServerSocket server = new ServerSocket(10002);  
        Socket client = null;  
        boolean f = true;  
        while(f){  
            //�ȴ��ͻ��˵����ӣ����û�л�ȡ����  
            client = server.accept();  
            System.out.println("��ͻ������ӳɹ���");  
            //Ϊÿ���ͻ������ӿ���һ���߳�  
            new Thread(new ServerThread(client)).start();  
        }  
        server.close();  
    }

}