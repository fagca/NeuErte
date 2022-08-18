package _7_1_ferhat_revised.bankAccount;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Users {


    String name, password, dateOfBirth, marriageStatus,  relativeName, relativeAge, isTransferedSuceesfully;

    int accountNumber1, amountAccount1, accountNumber2, amountAccount2;

    public Users(String name, String password, String dateOfBirth, String marriageStatus, int amountAccount1, int amountAccount2) {
        this.name = name;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.marriageStatus = marriageStatus;
        this.amountAccount1 = amountAccount1;
        this.amountAccount2 = amountAccount2;
        this.accountNumber1 = randomNumberCreader();
        this.accountNumber2 = randomNumberCreader();
    }

    public int getAmountAccount1() {
        return amountAccount1;
    }

    public void setAmountAccount1(int amountAccount1) {
        setAmountAccount1(amountAccount1);
    }

    public int getAmountAccount2() {
        return amountAccount2;
    }

    public void setAmountAccount2(int amountAccount2) {
        setAmountAccount2(amountAccount2);
    }

    public int randomNumberCreader  ()
    {

        return (int)((Math.random()*10000000)+1);
    }

    public  String CheckMariageStatus(){

        String res = "";

        if(marriageStatus.equals("married")){
            Scanner dp = new Scanner(System.in);
            System.out.print("Do you want to add add your relative? ('Yes' or 'No'): ");
            String answer = dp.nextLine();
            if(answer.equalsIgnoreCase("Yes")){
                System.out.print("What is your relative name?: ");
                String rname = dp.nextLine();
                System.out.print("Date of birth relative?: ");
                String age = dp.nextLine();
                AddRelative a1 = new AddRelative(rname , age);
                relativeName =a1.fullName;
                relativeAge = a1.age;

                res= "Transaction done successfully";

                if(relativeAge.equals("0")){
                    relativeName = "Relative should be more then 18 years old";
                    relativeAge = "Relative should be more then 18 years old";
                    res= "Relative should be more then 18 years old";
                }

            }else{
                res =  "Not able to add relative";
            }
        }
        return res;
    }

    //
    public void transfer(Users u1,Users u2)
    {


        Scanner oku2 = new Scanner(System.in);
        System.out.print("Do you want to transfer between your 'own' accounts or 'different' user? ('own' or 'different') : ");
        String answer = oku2.nextLine();

        System.out.print("Gönderilecek miktar?:");
        Scanner oku3 = new Scanner(System.in);
        int miktar = oku3.nextInt();



        if (answer.equalsIgnoreCase("own"))
            Account.transferToOwnAccount(u1, miktar);

        else Account.transferOtherUser(u1, u2, miktar);


    }


    //



    public static String checkAge(String age){

        LocalDate date = LocalDate.now();
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("d/MM/uuuu");
        String text = date.format(formatters);
        LocalDate today = LocalDate.parse(text, formatters);

        LocalDate myAge = LocalDate.parse(age, formatters);

        int num = today.compareTo(LocalDate.parse(age, formatters));

        String result ="";

        if(num>18){

            result = "You can get a credit card";

        }else if(num < 18){

            result = "You should be at least 18 years old to get a credit card.";

        } else if(num==18){

            if( today.getMonthValue()>myAge.getMonthValue()){

                result = "You can get a credit card";

            }else if(today.getMonthValue()<myAge.getMonthValue()){

                result = "You should be at least 18 years old to get a credit card.";

            }else if(today.getMonthValue()==myAge.getMonthValue()){

                if(today.getDayOfMonth()>myAge.getDayOfMonth()){

                    result = "You can get a credit card";

                }else {

                    result =  "You should be at least 18 years old to get a credit card.";
                }
            }
        }

        return result;

    }



    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +"\n"+
                ", password='" + password + '\'' +"\n"+
                ", dateOfBirth='" + dateOfBirth + '\'' +"\n"+
                ", marriageStatus='" + marriageStatus + '\'' +"\n"+
                ", isTransferedSuceesfully='" + isTransferedSuceesfully + '\'' +"\n"+
                ", accountNumber1=" + accountNumber1 +"\n"+
                ", amountAccount1=" + amountAccount1 +"\n"+
                ", accountNumber2=" + accountNumber2 +"\n"+
                ", amountAccount2=" + amountAccount2 +"\n"+
                ", relativeName='" + relativeName + '\'' +"\n"+
                ", relativeAge='" + relativeAge + '\'' +"\n"+
                '}';
    }
}
