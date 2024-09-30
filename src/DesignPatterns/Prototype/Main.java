package DesignPatterns.Prototype;

public class Main{
    public static void main(String[] args) throws Exception {
        System.out.println("Creating object by using prototype design pattern");
                NetworkConnection networkConnection = new
                        NetworkConnection();
        networkConnection.setIp("127.0.0.0");
        networkConnection.loadVeryImportantData();
        System.out.println(networkConnection);
        Object object = networkConnection.clone();
        NetworkConnection newObject =
                (NetworkConnection)object;
        System.out.println(newObject);
    }
}
