public class CPU {

    private String model;

    public CPU(String model) {
        this.model = model;
    }

    public String bootUp() {
        return "CPU " + model + " is powering up.";
    }

    public String getModel() {
        return model;
    }

    public String identifyRole() {
        return "I am the CPU class. I process instructions and perform computations for the computer system.";
    }
}
