package week3;

import java.util.Scanner;

public class Quiz {
    Scanner sr= new Scanner(System.in);
    public void qna(){
        int co=0;
        int in=0;
        String q[]=new String[20];
        String[] answer={"b","d","a","c","c","a","a","b","a","a"};
        q[0]="What is the capital of Nepal?";
        q[1]="Where is Mt.Everest?";
        q[2]="How high is Mt.Everest?";
        q[3]="Who is the father of Biology?";
        q[4]="Where was the first case of Covid-19 found?";
        q[5]="Who is the inventor of pen?";
        q[6]="How much is 30-6?";
        q[7]="Who invented bulbs?";
        q[8]="Which is the closest planet to Earth?";
        q[9]="Who is the father of computer?";
        String a[]={"Delhi","China","2000","Theopratus","India","Ford","24","Newton","Mars","Chrales Babage"};
        String b[]={"Kathmandu","Nigeria","2323","Hippocratus","Finland","Leo","10","Edison","Neptune","Bill Gates"};
        String c[]={"Pokhara","Finland","1234","No one","China","Waterman","2","Gaileleo","Venus","Mark Zulkerberg"};
        String d[]={"New York","Nepal","8848","Doctor","USA","Henry","1","Einstein","Sun","Google"};



            System.out.println("Welcome to who wants to be a millionaire");
            System.out.println();
            System.out.println("You need to answer 9 out of 10 to pass");
            for(int i=0;i<10;i++){
                System.out.printf("%2s %1d %5s","Q",(i+1),q[i]);
                System.out.println();
                System.out.printf("%3s %-1s %8s %1s","a",a[i],"b",b[i]);
                System.out.println();
                System.out.printf("%3s %-1s %6s %1s","c",c[i],"d",d[i]);
                System.out.println();
                System.out.print("Enter your answer: ");
                String ans=sr.next();
                if(answer[i].equalsIgnoreCase(ans)){
                    System.out.println("You are correct!");
                    co++;
                    System.out.println("Score: "+co+" / "+(i+1));
                }
                else
                {
                    System.out.println("Incorrect!!");
                    in++;
                    System.out.println("Score: "+co+" / "+(i+1));
                    System.out.print('\f');
                }


            }
            if(co>=9){
                System.out.println("Congrats you have passed!!");
                System.out.println("Score: "+co+" / 10");
            }
            else{
                System.out.println("You are almost there better luck next time!!");
                System.out.println("Score: "+co+" / 10");
            }


    }

    public static void main(String[] args) {
        Quiz q= new Quiz();
        q.qna();
    }

    }



