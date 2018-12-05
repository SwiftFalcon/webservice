package main;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import servlets.AllRequestsServlet;

public class Main {
    public static void main(String[] args) throws Exception{
        AllRequestsServlet frontend = new AllRequestsServlet();

        //creating servlet-container and set what it'll process
        ServletContextHandler context =
                new ServletContextHandler(ServletContextHandler.SESSIONS);

        Server server = new Server(8080);
        server.setHandler(context);

        server.start();
        server.join();
        //context.addServlet(new ServletHolder(frontend), "/authform");
    }

}
