package Main;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * The {@code HttpQueue} class manages a queue of HTTP requests, it preserves their insertion order,
 * ensures no duplicates and consider request`s priority.
 * It provides functionality for adding, removing, prioritizing,
 * processing, and printing HTTP requests in the queue.
 */
public class HttpQueue {
    /**
     * Used when {@link HttpRequest} is added to queue
     * it is set as an order of the request in queue and then incremented.
     *
     * It is implemented in this way so it is easy to sort queue
     */
    private int incr;

    /**
     * A {@link HashSet} implementation that holds the HTTP requests in the queue.
     * <p>
     * This {@code queue} is initialized as a {@link LinkedHashSet} to preserve
     * the insertion order of requests while ensuring that duplicate requests
     * are not allowed.
     * </p>
     */
    HashSet<HttpRequest> queue = new LinkedHashSet<>();

    /**
     * Constructs an {@code Main.HttpQueue} with the specified HTTP requests.
     * <p>
     * This constructor allows initializing the queue with one or more
     * {@link HttpRequest} objects, which are added to the queue upon instantiation.
     * </p>
     * @param requests one or more {@link HttpRequest} objects to be added to the queue.
     *                 If no requests are provided, the queue will be initialized empty.
     */
    public HttpQueue(HttpRequest ... requests){
        addRequests(requests);
    }

    /**
     * Processes and sends the first request in the queue.
     * <p>
     * If a request is available in the queue, it is sent and then removed.
     * If the queue is empty, a message is printed indicating no requests are available.
     * </p>
     */
    public void processRequest(){
        //we get the first request in queue
        Optional<HttpRequest> req = queue.stream().findFirst();
        if(req.isPresent()) {
            HttpRequest existingReq = req.get();
            System.out.println("Sending: " + existingReq);
            queue.remove(existingReq);
        }
        else {
            System.out.println("No requests in queue!");
        }
    }

    /**
     * Changes the priority of a specific {@link HttpRequest} and updates the queue order.
     *
     * @param req the {@link HttpRequest} whose priority is to be changed.
     * @param priority the new priority value to set for the request.
     */
    public void changeRequestPriority(HttpRequest req, int priority){
        req.changePriority(priority);
        sortQueue();
    }

    /**
     * sorts requests in queue
     *
     * it is achieved by using stream api and comparator with 2 key elements:
     * first is priority and second is order
     */
    private void sortQueue(){
        queue = queue.stream()
                .sorted(Comparator.comparing(HttpRequest::getPriority)
                        .thenComparing(Comparator.comparingInt(HttpRequest::getOrder).reversed()))
                .collect(Collectors.toCollection(LinkedHashSet<HttpRequest>::new));
    }

    /**
     * prints every request of the queue
     * using {@link HttpRequest#toString() toString()} method
     */
    public void printQueue(){
        for(HttpRequest req : queue){
            System.out.println(req.toString());
        }
    }

    /**
     * adds new {@link HttpRequest requests} in queue
     * it is needed to {@link #sortQueue() sort} the queue after that
     * to make sure that queue order is right.
     * This method used in constructor.
     * @param requests is array of the requests to be added in queue
     */
    public void addRequests(HttpRequest ... requests){
        for (HttpRequest req : requests){
            req.setOrder(incr);
            incr++;
            queue.add(req);
        }
        sortQueue();
    }

    /**
     * removes {@link HttpRequest request} from the queue
     * @param req is request to be removed
     */
    public void removeRequest(HttpRequest req){
        queue.remove(req);
    }

}