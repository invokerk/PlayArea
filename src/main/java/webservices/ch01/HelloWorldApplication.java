package webservices.ch01;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Comment here about the class
 * User: Fizal
 * Date: 11/5/13
 * Time: 12:16 AM
 */
@ApplicationPath("/helloworldapp")
public class HelloWorldApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> set = new HashSet<>();
        set.add(HelloWorldResources.class);
        return set;
    }
}