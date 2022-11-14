import java.util.Random;
import java.util.Scanner;
public class games {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        String bro;
        while(true){
       
        int number = random.nextInt(2);
         
        System.out.println();
        if(number == 0){
            String name = "Stone";
        }
        else if(number==1){
            String name="paper";
        }
        else if(number==2){
            String name="scissor";
        }
        System.out.println("enter your move ");
        System.out.println("to quit press (q)");
        bro = scan.nextLine();
        if(bro=="q"){
            break;
        }
        else if(bro=="Stone" || bro=="stone" && name=="Stone"){
            System.out.println(bro+" vs "+name);
            System.out.println("It's a Draw!!!");

        }
        else if(bro=="stone" || bro=="Stone" && name=="paper"){
            System.out.println(bro+" vs "+name);
            System.out.println("you loose!!");

        }
        else if(bro=="Stone" || bro=="Stone" && name=="scissor"){
            System.out.println(bro+" vs "+name);
            System.out.println("you win!!");

        }
        else if(bro=="paper" || bro=="PAPER" && name=="stone"){
            System.out.println(bro+" vs "+name);
            System.out.println("you win");

        }
        else if(bro=="Paper" || bro=="paper" && name=="paper"){
            System.out.println(bro+" vs "+name);
            System.out.println("It's a Draw!!!");

        }
        else if(bro=="Paper" || bro=="paper" && name=="scissor"){
            System.out.println(bro+" vs "+name);
            System.out.println("you loose!!");

        }
        else if(bro=="scissor" || bro=="Scissor" && name=="paper"){
            System.out.println(bro+" vs "+name);
            System.out.println("you win!!");



       }
       else if(bro=="scissor" || bro=="Scissor" && name=="stone"){
        System.out.println(bro+" vs "+name);
        System.out.println("you loose!!");




   }
   else if(bro=="scissor" || bro=="Scissor" && name=="scissor"){
    System.out.println(bro+" vs "+name);
    System.out.println("it's a draw!!");



}

       
        
    }
}
}
