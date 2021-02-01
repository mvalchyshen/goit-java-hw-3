package main.java.ModuleThree;

public class ATM {
    public int countBanknotes(int sum){
        int[] banknotes = {500,200,100,50,20,10,5,2,1};
        int result = 0;
        int i = 0;
        while(i < banknotes.length){

            result += sum/banknotes[i];
            sum%=banknotes[i];
            /*
            i=5, 10/10=1, result = 1;
            i=6, 10/5 = 2, result = 1+2;
            i=7, 10/2=5,result = 1+2+5,
            i=8, 10/1=10, result = 1+2+5+10;


            */

            i++;
        }


        return result;
    }
    public static void main(String[] args) {
        System.out.println(new ATM().countBanknotes(1199));

    }

}
