import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    private List<Interceptor> interceptors;

    public Dispatcher() {
        interceptors = new ArrayList<Interceptor>();
    }

    public void rentalAdded(ContextObject contextObject) {
        for (Interceptor interceptor : interceptors) {
            interceptor.rentalAdded(contextObject);
        }
    }

    public void register(Interceptor interceptor) {
        interceptors.add(interceptor);
    }

    public void remove(Interceptor interceptor) {
        interceptors.remove(interceptor);
    }
}
