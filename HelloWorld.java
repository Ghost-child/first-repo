public class HelloWorld{
    public static void main(String args[]){
        System.out.println("Hello World from Java!");

        HelloWorld obj = new HelloWorld();
        
        obj.sayHello("Lennox");
    }

    public void sayHello(String name){
        System.out.println("Hello there " + name);
    }
}
