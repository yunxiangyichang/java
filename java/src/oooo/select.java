package oooo;

public class select {
    public static void main(String[] args){
        /*double d=Math.random();
        System.out.println(d);
        System.out.println("#########################");
        int i=(int)(6*Math.random())+1;
        int j=(int)(6*Math.random())+1;
        int k=(int)(6*Math.random())+1;
        int count=i+j+k;
        if(count>15){
            System.out.println("今天手气很好");
        }
        if(count>=10&&count<=15){
            System.out.println("今天手气一般");
        }
        if(count<10){
            System.out.println("今天手气很差");
        }
        System.out.println("得了"+count+"分");*/

        /*double r=10*Math.random();
        double area=Math.PI*Math.pow(r,2);
        double circle=2*Math.PI*r;
        System.out.println("半径："+r);
        System.out.println("面积："+area);
        System.out.println("周长："+circle);*/


        /*int age=(int)(100*Math.random());
        System.out.println("年龄："+age);
        if(age<15){
            System.out.println("年轻！");
        }else if(age<25){
            System.out.println("还不老！");
        }else if(age<60){
            System.out.println("接近老年了");
        }else{
            System.out.println("哈哈，你是老头了");
        }
        System.out.println("真好！");  */


        /*int month=(int)(1+12*Math.random());
        System.out.println(month+"月份");
        switch (month){
            case 1:
                System.out.println("一月份");
                break;
            case 2:
                 System.out.println("二月份");
                     break;
            default:
                System.out.println("其他");
                break;
        }*/
        for (int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(j*i)+"\t");
            }
            System.out.println();
        }
    }
}
