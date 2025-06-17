import java.util.Scanner;
import java.util.Random;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class chatbot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("🤖 ChatBot: Hello! I'm your AI Chatbot. Ask me anything or type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.contains("hi") || userInput.contains("hello")) {
                String[] greetings = {
                    "Hi there! How can I help you?",
                    "Hello! Need any assistance?",
                    "Hey! What can I do for you?",
                    "Hi! Ready to chat!"
                };
                System.out.println("ChatBot: " + greetings[random.nextInt(greetings.length)]);
            } else if (userInput.contains("your name")) {
                System.out.println("ChatBot: I'm ChatBot, your friendly assistant.");
            } else if (userInput.contains("joke")) {
                System.out.println("ChatBot: Why don’t scientists trust atoms? Because they make up everything!");
            } else if (userInput.contains("how are you")) {
                System.out.println("ChatBot: I'm doing great! Thanks for asking.");
            } else if (userInput.contains("help")) {
                System.out.println("ChatBot: You can ask me things like jokes, time, weather, or say hi!");
            } else if (userInput.contains("weather")) {
                System.out.println("ChatBot: I'm not connected to the internet, but it's always sunny in here!");
            } else if (userInput.contains("time")) {
                LocalTime now = LocalTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
                System.out.println("ChatBot: The current time is " + now.format(formatter));
            } else if (userInput.contains("bye")) {
                System.out.println("ChatBot: Goodbye! Have a great day!");
                break;
            } else {
                System.out.println("ChatBot: I'm not sure how to respond to that.");
            }
        }
    }
}
