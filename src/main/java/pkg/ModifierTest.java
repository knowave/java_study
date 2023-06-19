package pkg;

public class ModifierTest {
    private void messageInside() {
        System.out.println("This is private Modifier");
    }

    public void messageOutside() {
        System.out.println("This is public Modifier");
        messageInside();
    }

    protected void messageProtected() {
        System.out.println("This is protected Modifier");
    }
}
