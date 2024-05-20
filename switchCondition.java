public class switchCondition {
    public static void main(String[] args) {
        String givenString = "Hello";
        switch (givenString) {
            case "Yes":
                System.out.println("The string is 'Yes'.");
                break;

            case "No":
                System.out.println("The string is 'No'.");
                break;
        
            default:
                System.out.println("None");
                break;
        }
    }
}
