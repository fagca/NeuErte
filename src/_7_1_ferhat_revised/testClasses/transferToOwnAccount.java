package _7_1_ferhat_revised.testClasses;

import _7_1_ferhat_revised.bankAccount.AddRelative;
import _7_1_ferhat_revised.bankAccount.Users;

public class transferToOwnAccount {

    public static void main(String[] args) {

        Users u1 = new Users("Steven" , "Gerard", "10/02/2000", "married" ,1000 , 2000);
        AddRelative r1 = new AddRelative();


        u1.CheckMariageStatus();
        u1.transfer(u1,u1);
        r1.relativeAgeChecker("");
        System.out.println(u1.toString());




    }

}

