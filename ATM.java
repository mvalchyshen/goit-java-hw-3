class ATM {
    public int countBanknotes(int sum){
        int[] banknotes = {500,200,100,50,20,10,5,2,1};
        int result = 0;
        int i = 0;
        while(i < banknotes.length){

            result += sum/banknotes[i];
            sum%=banknotes[i];
            i++;
        }


        return result;
    }
    public static void main(String[] args) {
        System.out.println(new ATM().countBanknotes(1199));

    }

}
