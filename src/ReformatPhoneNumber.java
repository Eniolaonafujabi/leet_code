public class ReformatPhoneNumber {
        public String reformatNumber(String number) {
        number = number.replace("_","");
        StringBuilder buildedNumber = new StringBuilder();
        int count1 = 0;
        for(int count = 0; count<number.length();count++){
            if(count1 == 3){
                buildedNumber.append('_');
                count1 = 0;
            }
            buildedNumber.append(number.charAt(count));
            count1++;
        }
        return buildedNumber.toString();
    }
    public static void main(String[] args) {
            ReformatPhoneNumber number = new ReformatPhoneNumber();
            System.out.println(number.reformatNumber("12_345_6"));
    }
}
