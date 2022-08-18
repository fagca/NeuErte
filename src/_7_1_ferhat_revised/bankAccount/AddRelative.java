package _7_1_ferhat_revised.bankAccount;

public class AddRelative {

    public static String fullName , age;

    public AddRelative(String fullName , String age){
        this.fullName = fullName;
        boolean res= relativeAgeChecker(age);
        if(res==true){
            this.age = age;
        }else{
            this.age = "0";
        }
    }

    public AddRelative() {
    }

    public boolean relativeAgeChecker(String relativeAge){
        String result = Users.checkAge(relativeAge);
        if(result.equals("You can get a credit card")){
            return true;
        }
        return false;
    }







}
