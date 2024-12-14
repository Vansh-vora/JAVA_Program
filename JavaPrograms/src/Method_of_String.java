public class Method_of_String {
    public static void main(String[] args) {
        String name="Vansh";
        System.out.println(name);

        //To check the length
        int value = name.length();
        System.out.println(value);

        //to convert all upper to lower
        String lstring = name.toLowerCase();
        System.out.println(lstring);

        //to convert all lower to upper
        String ustring = name.toUpperCase();
        System.out.println(ustring);

        //To remove whitespaces
        String nonTrimmedString="           Vansh       ";
        System.out.println(nonTrimmedString);
        String trimmedstring = nonTrimmedString.trim();
        System.out.println(trimmedstring);

        //to start string from where you want
        System.out.println(name.substring(3));

        //to start and end from where you want
        System.out.println(name.substring(1,3));

        //to replace a character
        System.out.println(name.replace('a','n'));
        System.out.println(name.replace("nn","aa"));

        //to check start
        System.out.println(name.startsWith("Van"));

        //to check end
        System.out.println(name.endsWith("sh"));

        //to check which character is there in taken index
        System.out.println(name.charAt(2));

        //to check the first occurence of char in a string
        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf("an",5));

        //to check the last occurence of char in a string
        System.out.println(name.lastIndexOf('s'));

        //to check the string is equal or not
        System.out.println(name.equals("Vansh"));

        //to check the string is equal or not without considering case
        System.out.println(name.equalsIgnoreCase("vansh"));





    }
}
