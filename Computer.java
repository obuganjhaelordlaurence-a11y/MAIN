public class Computer {

    private CPU internalProcessor;   // Composition
    private User activeUser;         // Aggregation

    public Computer(CPU processor, User user) {
        this.internalProcessor = processor;
        this.activeUser = user;
    }

    public String runSystemReport() {
        return "System Report: CPU model is " +
                internalProcessor.getModel() +
                " and current user is " +
                activeUser.getUsername() + ".";
    }

    public String identifyRole() {
        return "I am the Computer class. I coordinate hardware components and user interaction in the workstation.";
    }
}
