package comp.comp152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MessageQueue queue = new MessageQueue();
        System.out.println(queue.getStatus(1));

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String message = keyboard.nextLine();
        System.out.println("Enter your name: ");
        String sender = keyboard.nextLine();
        System.out.print("Enter the recipient: ");
        String recipient = keyboard.nextLine();

        queue.enqueue(message, "From" + sender + " to" + recipient);
        System.out.println(queue.getStatus(1));
        System.out.println(queue.head.letter);
        System.out.println(queue.tail.letter);
        System.out.println(queue.sendReceive);

    }
}
