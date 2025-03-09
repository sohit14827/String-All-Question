package StringBuilderVSstringBuffer;

public class StringBuffer1 {
    public static void main(String[] args) throws InterruptedException{
        StringBuffer sb = new StringBuffer();
        Task t1 = new Task(sb);
        Task t2 = new Task(sb);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Final length of String"+sb.length());
        System.out.println(sb);

    }    
}
class Task extends Thread{
    private StringBuffer sb;
public Task(StringBuffer sb2){
    this.sb =sb2;
}
public void run(){
    for(int i=0;i<100;i++){
        sb.append("s");
    }
}
}

