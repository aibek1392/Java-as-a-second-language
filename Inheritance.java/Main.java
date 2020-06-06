import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOexception;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



class Main implements Runnable{

    private Integer instanceCount = 0;
    private static Integer staticCount = 0;

  public static void main(String[] args) {
       Main main1 = new Main();
       Main main2 = new Main();
       main1.instanceMethodIncr();
       main1.instanceMethodIncr();
       main1.instanceMethodIncr();
       main1.instanceMethodIncr();

        main2.instanceMethodIncr()
        staticMethodIncr();
        staticMethodIncr();
        Main.staticMethodIncr();
        Main.staticMethodIncr();

        main1.staticMethodIncr();
        main2.staticMethodIncr();
        Main main = new Main();
        Integer result =  main.divide(10, 5);
        System.out.println(result);
        //Static Topic
        main.writeList();
}
//Exception Handling/Specifying //
    public Integer divide(Integer num1, Integer num2){
        Integer num  
        try{
           num = num1/num2
        } catch (ArithmeticException ae){
            System.out.println(ae);
        }
        System.out.println("Program is done!");
        return 0;
    }

    public void writeList(){
        try(){
            PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"))
            out.close();
        }catch(IOexception io){
            System.out.println(io)
        }
    }


    public void instanceMethodIncr(){
        instanceCount++;
        System.out.println(instanceCount)
    }

    public static void staticMethodIncr(){
        staticCount++;
        System.out.println(staticCount)
    }

    String threadName = Thread.currentThread().getName();
    System.out.println(threadName);
    Thread thread0 = new Thread(new Main());
    thread0.start();
    System.out.println("main thread is done running")
    
    public void run(){
        //seperate thread
        String threadName = Thread.currentThread().getName();
        System.out.println("Hey this is running from a seperate thread");
        System.out.println(threadName)
    
    }

    public void run(){
        String threadName = Thread.currentThread().getName();
        String[] strArr = {
            threadName + " - one",
            threadName + " - two",
            threadName + " - three"
        };
        try{
            for(int i = 0; i< strArr.length; i++){
                System.out.println(strArr[i])
                Thread.sleep(1000)
            }
        }catch(InterruptedException ie){
            System.out.println(threadName + " - " + ie.getMessage());
        }
    }
    // Static we use for space efficient, it shares one place in memory, 1000 in one 

    //Streams
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("one");
    arrayList.add("two");
    
    
    Stream<String> mappedStream = arrayList.stream().map((String numStr)-> "Number " + numStr); //linda expression
    
    List<String> mappedArrayList = mappedStream.collect(Collectors.toList())
    System.out.println(mappedArrayList);


    // String itemFromList = arrayList.remove(0);

    System.out.println(itemFromList);

    System.out.println(arrayList);


}
