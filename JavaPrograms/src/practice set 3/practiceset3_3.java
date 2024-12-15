//write a java program to fill in a letter template which looks like below:
// letter="Dear<|name|>,Thanks a lot
// Replace <|name|> with a string(some name)
public class practiceset3_3 {
    public static void main(String[] args) {
        String name="Dear name,Thanks a lot";
        System.out.println(name);
        name=name.replace("name","vansh");
        System.out.println(name);

    }
}
