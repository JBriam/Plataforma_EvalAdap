
package vista;

// Context.java
public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        if (state != null) {
            state.handleRequest();
        }
    }
}

