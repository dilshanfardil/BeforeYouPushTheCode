package mistake;

public class NamingConvention
{
    public static void conventions()
    {

        /*
        * Notes:
        *  - meaningfully Names
        *  - method names with responsibility
        *  - Scope
        */


        /*
         * Classes should be named using PascalCasing, with the first letter of each word capitalized.
         * A class name should be a noun or a word representative of an object.
         */
        String className = "Public class Employee";

        /*
         * Interfaces should be named using PascalCasing, with the first letter of each word capitalized.
         * An interface name should be an adjective.
         */
        String interfaceName = "Interface Printable";

        /*
         * Method should be named using camelCasing.
         * Method names should always start with a lower case letter. Use verbs
         */
        String methodName = "public void draw()";

        /*
         * Variables should be named using camelCasing.
         * Variable names should always start with a lower case letter.
         */
        String variableName = "String employeeName";

        /*
         * Packages should be named using snake_casing.
         * Package names should always start with a lower case letter.
         */
        String packageNaming = "com.wso2.api.dto";

        /*
         * Constant variables should be named using snake_casing.
         * Constant variable names should have all upper case letters.
         */
        String constantNaming = "public static MAX_HEADER_SIZE";

    }
}
