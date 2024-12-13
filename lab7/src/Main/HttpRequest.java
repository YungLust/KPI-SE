package Main;

/**
 * The {@code HttpRequest} class manages HTTP request, it contains request`s
 * url, status code, message, priority and order.
 * It provides functionality for printing the request
 * and changing its priority according to the maxPriority parameter
 */
public class HttpRequest {
    /**
     * this is maximum priority which is 8 bytes.
     * Priority is maxed at this value.
     */
    private final int maxPriority = 256;

    private String url;
    private int code;
    private String message;
    private int priority;
    private int order;

    /**
     * Constructor with the specified URL, status code, message, and priority.
     *
     * @param url the URL to which the request is directed
     * @param code the HTTP status code associated with the request
     * @param message the message or description of the request
     * @param priority the priority level of the request
     */
    public HttpRequest(String url, int code, String message, int priority) {
        this.url = url;
        this.code = code;
        this.message = message;
        this.priority = priority;
    }

    /**
     * Constructor with the specified URL, status code, message,
     * and default priority which is 20.
     *
     * @param url the URL to which the request is directed
     * @param code the HTTP status code associated with the request
     * @param message the message or description of the request
     */
    public HttpRequest(String url, int code, String message) {
        this.url = url;
        this.code = code;
        this.message = message;
        this.priority = 20;
    }

    /**
     * It changes the priority of the HTTP request
     * priority is needed for {@link HttpQueue queue}
     * If the new priority exceeds the maximum allowable value or is negative,
     * it is adjusted accordingly.
     * @param priority is the new priority of the HTTP request.
     */
    public void changePriority(int priority) {
        priority = Math.min(priority, maxPriority);
        priority = priority < 0 ? (maxPriority/2 - priority) : priority;
        System.out.println(this + " — Changing priority to " + priority);
        this.priority = priority;
    }

    /**
     * It returns String representation of the HTTP request
     * @return a string with the request details including code, message, and priority
     */
    @Override
    public String toString() {
        return "Request with the code " + code + ": " + message + "\nto url: " + url + " — " + getPriority();
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getPriority() {
        return priority;
    }

    public int getOrder() {
        return order;
    }
}
