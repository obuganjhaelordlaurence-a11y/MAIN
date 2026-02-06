
    public static void main(String[] args) {

        CPU processor = new CPU("Intel i7");
        User employee = new User("jdelacruz");

        Computer officeComputer = new Computer(processor, employee);

        String output =
                officeComputer.identifyRole() + "\n" +
                processor.identifyRole() + "\n" +
                employee.identifyRole() + "\n" +
                processor.bootUp() + "\n" +
                employee.login() + "\n" +
                officeComputer.runSystemReport();

        // ✅ ONLY PRINT STATEMENT IN THE ENTIRE PROGRAM
        System.out.println(output);
    }
}
