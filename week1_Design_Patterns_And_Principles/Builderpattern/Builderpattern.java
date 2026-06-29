package Builderpattern;
class Computer {

    private String cpu;
    private int ram;
    private int storage;

    private Computer(Builder builder) {
        cpu = builder.cpu;
        ram = builder.ram;
        storage = builder.storage;
    }

    public void display() {
        System.out.println("CPU : " + cpu);
        System.out.println("RAM : " + ram + " GB");
        System.out.println("Storage : " + storage + " GB");
    }

    static class Builder {

        private String cpu;
        private int ram;
        private int storage;

        public Builder setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRAM(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

public class Builderpattern {

    public static void main(String[] args) {

        Computer computer = new Computer.Builder()
                .setCPU("Intel i7")
                .setRAM(16)
                .setStorage(512)
                .build();

        computer.display();
    }
}
