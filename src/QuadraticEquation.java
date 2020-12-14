import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;
    Scanner input=new Scanner(System.in);

    public void setA() {
        System.out.println("input A");
        double inputA =input.nextDouble();
        this.a = inputA ;
    };
    public void setB() {
        System.out.println("input B");
        double inputB=input.nextDouble();
        this.b = inputB;
    };
    public void setC() {
        System.out.println("input C");
        double inputC= input.nextDouble();
        this.c = inputC;
    };
    public double getDelta(){
        return this.b*this.b-4*this.a*this.c;
    }
    public String getRoot(){
        String result="";
        if (this.a==0){
            result=" this is not  QuadraticEquation";
        }else {
            if (this.getDelta()<0){
                result="The equation has no roots";
            }else if(this.getDelta()==0) {
                result=" The equation has one root is "+ -this.b/(2*this.a);
            }else {
                result="The equation has two roots is "+(-b-Math.pow(this.getDelta(),0.5))/(2*this.a)
                        +" and "+(-b+ Math.pow(this.getDelta(),0.5))/(2*this.a);
            }
        }
        return result;
    }
}
