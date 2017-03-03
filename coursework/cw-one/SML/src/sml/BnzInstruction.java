package sml;

public class BnzInstruction extends Instruction {
    private int register;
    private String nextLabel;

    public BnzInstruction(String label, String op) {
        super(label, op);
    }

    public BnzInstruction(String label, int register, String nextLabel) {
        this(label, "bnz");
        this.register = register;
        this.nextLabel = nextLabel;
    }

    @Override
    public void execute(Machine m) {
        if (m.getRegisters().getRegister(register) != 0) {
            System.out.println("This line executed");
            m.getProg().get(m.getLabels().indexOf(nextLabel)).execute(m);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " reroute to instruction " + nextLabel + " if register " + register + " is empty";
    }
}
