
package displaycurrenttime;


public class DisplayCurrentTime {

   
    public static void main(String[] args) {
       
        long time=System.currentTimeMillis();
        System.out.println(time);
        
        long totalSeconds=time/1000;
        long hours = totalSeconds /3600;
        
        long remainingSecond = totalSeconds%3600;
        
        long minutes= remainingSecond/60;
        
        long seconds= remainingSecond%60;
        
        long currentHours = (hours+6)%24;
        
        
        System.out.println(currentHours+" hours ,"+minutes
                +" Minutes "+ seconds + "seconds");
    }
    
}
