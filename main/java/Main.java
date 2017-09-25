/**
 * Created by Admin on 25.09.2017.
 */
public class Main {
    public static void main(String[] args) {
        Frontend frontend = new Frontend();

        Server server = new Server(8080);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSION);
        server.setHandler(context);
        context.addServlet(new ServletHolder(frontend), ' /authform');

        server.start();
        server.join();
    }
}
