public class InfinityCode2 {

    public static void main(String[] args) {
        if (args.length == 1 && args[0].equals("ver")) {
            System.out.println("Infinity code 2.0");
        } else if (args.length == 2) {
            String command = args[0];
            switch (command) {
                case "pin":
                    System.out.println("Enter text:");
                    String text = System.in.readLine();
                    System.out.println("Text: " + text);
                    break;
                case "RANDNUM":
                    System.out.println("Random number: " + (int)(Math.random() * 100));
                    break;
                case "open":
                    System.out.println("Enter file name:");
                    String fileName = System.in.readLine();
                    File file = new File(fileName);
                    if (file.exists()) {
                        System.out.println("File exists.");
                    } else {
                        System.out.println("File does not exist.");
                    }
                    break;
                case "save":
                    System.out.println("Enter file name for saving:");
                    String fileNameForSaving = System.in.readLine();
                    System.out.println("Enter text to save:");
                    String textToSave = System.in.readLine();
                    File fileForSaving = new File(fileNameForSaving);
                    try {
                        FileWriter fileForWriting = new FileWriter(fileForSaving);
                        fileForWriting.write(textToSave);
                        fileForWriting.close();
                        System.out.println("Text saved.");
                    } catch (IOException e) {
                        System.out.println("Error saving file.");
                    }
                    break;
                case "LoopZ":
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Loop: " + i);
                    }
                    break;
                case "PonZ":
                    for (int i = 10; i >= 0; i--) {
                        System.out.println("Loop: " + i);
                    }
                    break;
                case "obr":
                    String textForOpposite = "Hello, world!";
                    System.out.println("Opposite text: " + textForOpposite.reverse());
                    break;
                case "import":
                    System.out.println("Import library: import java.util.Scanner;");
                    break;
                case "turtle":
                    System.out.println("Turtle class: import java.awt.Graphics;");
                    break;
                case "off":
                    System.out.println("Shutting down the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Unknown command.");
            }
        } else {
            System.out.println("Invalid input.");
        }
    }
}
