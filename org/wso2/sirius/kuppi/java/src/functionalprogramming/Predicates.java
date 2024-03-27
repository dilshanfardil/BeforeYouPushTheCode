package functionalprogramming;

import java.util.function.Predicate;

public class Predicates
{
    public static void main(String[] args)
    {
        String phoneNumber = "07123456789";
        System.out.println(predicatesChaining(phoneNumber));
        System.out.println(checkValidPhoneNumber(phoneNumber));
    }

    static boolean checkValidPhoneNumber(String phoneNumber){
        // Checked is a valid phone number
        return false;
    }

    static boolean predicatesChaining(String phoneNumber){
        // Checked is a valid phone number
        return phoneNumber.contains("a");
    }




}
