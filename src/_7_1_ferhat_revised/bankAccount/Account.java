package _7_1_ferhat_revised.bankAccount;

public class Account {

    public static int deposit(int accountAmount , int amountToAdd)
    {
        accountAmount += amountToAdd;

        return accountAmount;
    }



    public static int withDraw(int accountAmount , int withdrawAmount)
    {
        accountAmount -= withdrawAmount;

        return accountAmount;
    }


    public static String transferOtherUser(Users sendingUser ,Users receivingUser, double transferAmount)
    {

        String donecek = "";
        if (transferAmount> sendingUser.amountAccount1)
            donecek = "poor lol:)";


        else if (transferAmount <= sendingUser.amountAccount1)
        {
            double a = (transferAmount*0.98);

            sendingUser.amountAccount1 -= (int) (a);
            receivingUser.amountAccount1 += transferAmount;

            donecek = "Transaction is completed successfully";
        }
        return donecek;
    }


    public static String transferToOwnAccount(Users u1 ,int transferAmount)
    {
        String donecek2 = "";
        if (transferAmount> u1.amountAccount1)
            donecek2 = "ou need more money dude";

        else if (transferAmount <= u1.amountAccount1)
        {
            int a = (int) ((double) transferAmount*0.99);

            u1.amountAccount1 -= a;
            u1.amountAccount2 += transferAmount;

            donecek2 = "Transaction is completed successfully";
        }
        return donecek2;
    }





}
