package Recursion;
class Main {
    public static void main(String[] args) {

        // Check if any command-line arguments are passed
        if (args.length == 0) {
            System.out.println("No command-line arguments were passed.");
        } else {
            System.out.println("You passed " + args.length + " argument(s):");

            // Loop to print all arguments
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + i + ": " + args[i]);
            }
        }
    }
}
