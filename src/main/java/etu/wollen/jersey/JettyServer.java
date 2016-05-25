package etu.wollen.jersey;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

public class JettyServer {
    public static void main(String[] args){
        ResourceConfig config = new ResourceConfig();
        config.packages("etu.wollen.jersey");
        ServletHolder servlet = new ServletHolder(new ServletContainer(config));

        Server server = new Server(3333);
        ServletContextHandler context = new ServletContextHandler(server, "/*");
        context.addServlet(servlet, "/rest/*");

        try {
            server.start();
            server.join();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            server.destroy();
        }
    }
}
