package sml;

public class OutInstruction extends Instruction {
    private int register;
    private int registerValue;

    public OutInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public OutInstruction(String label, int register) {
        super(label, "out");
        this.register = register;
    }

    @Override
    public void execute(Machine m) {
        registerValue = m.getRegisters().getRegister(register);
        System.out.println(registerValue);
    }

    @Override
    public String toString() {
        return super.toString() + " output register " + register + "'s value of " + registerValue;
    }
}
