package Main;

import Command.*;

/**
 *  This class creates instances of Commands.Invoker and Command objects,
 *  showcasing how the pattern can be realized.
 */
public class Main {
    public static void main(String[] args) {
        HttpRequest req1 = new HttpRequest("https://www.youtube.com/", 101, "Switching protocols!");
        HttpRequest req2 = new HttpRequest("https://github.com/YungLust/", 404, "Account with such name not found!");
        HttpRequest req3 = new HttpRequest("https://www.olx.ua/uk/", 202, "Connection accepted!", 15);
        HttpRequest req4 = new HttpRequest("https://dou.ua/", 502, "Bad gateway!");
        HttpRequest req5 = new HttpRequest("https://www.imdb.com/", 500, "Internal server error!");
        HttpRequest req6 = new HttpRequest("https://www.instagram.com/rutraartur0/", 302, "Page found!", 15);

        HttpQueue queue = new HttpQueue(req1, req2, req3, req4, req5, req6);

        queue.printQueue();

        System.out.println();
        Invoker inv = new Invoker(new ChangeRequestPriority(req5, queue, 1));
        inv.execute();
        System.out.println();

        queue.printQueue();

        System.out.println();
        inv.setCommand(new ChangeRequestPriority(req2,queue,-10));
        inv.execute();
        System.out.println();

        queue.printQueue();

        System.out.println();
        inv.setCommand(new ProcessRequest(queue));
        inv.execute();
        inv.setCommand(new ProcessRequest(queue));
        inv.execute();
        inv.setCommand(new ProcessRequest(queue));
        inv.execute();

        System.out.println();
        queue.printQueue();


    }
}