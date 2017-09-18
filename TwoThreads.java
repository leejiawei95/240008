package twothreads;

public class TwoThreads extends Thread{

public static void main(String[] args) {
    new Thread(new TwoThreads()).start();
}

public void run(){
    try{
        for (int a=1; a<=10; a++){
        System.out.print(a+" ");
        sleep(1000);
        
            if(a==5){
                for(int b=1;b<11;b++){
                    System.out.print("A");
                }
            System.out.print(" ");
            sleep(1000);
            }
        }
    }
    catch (Exception e) {
        e.printStackTrace();
    }
}
}
