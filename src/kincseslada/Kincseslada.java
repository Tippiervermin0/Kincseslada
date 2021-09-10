
package kincseslada;

import java.util.Scanner;

public class Kincseslada {
    
    static Scanner sc = new Scanner(System.in);
    static Ladak a = new Ladak("Arany","Bennem van a kincs",0);
    static Ladak e = new Ladak("Ezüst","Nem bennem van a kincs",1);
    static Ladak b = new Ladak("Bronz","Az arany hazudik",0);
    
    public static void main(String[] args) {
        Start();
        
    }
    
    public static void Start(){
        System.out.println(a.toString());
        System.out.println(e.toString());
        System.out.println(b.toString());
        
        
        
        System.out.println("Hanyadik ládában van a kincs:");
        int melyik = sc.nextInt();
        while(melyik < 1 || melyik > 3){
            System.out.println("Hanyadik ládában van a kincs:");
            melyik = sc.nextInt();
        }
        if(melyik == 2){
            System.out.println("Eltaláltad!");
        }else{
            System.out.println("Nem talált!");
        }
    }
   
    

    
}
