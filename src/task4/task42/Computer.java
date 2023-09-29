package task4.task42;

public class Computer {
    enum Computers {
        Lenova(new Processor("i7"), new Memory(128), new Monitor(1280, 720)) {},
        Asus(new Processor("i9"), new Memory(512), new Monitor(1920, 1080)) {},
        DelL(new Processor("i3"), new Memory(64), new Monitor(1366, 768)) {},
        hp(new Processor("i5"), new Memory(1024), new Monitor(1920, 1080)) {};

        private final Processor pr;
        private final Memory mem;
        private final Monitor mona;

        Computers(Processor pr, Memory mem, Monitor mona) {
            this.pr = pr;
            this.mem = mem;
            this.mona = mona;
        }
    }

    public static void main(String[] args) {
        for (Computers x : Computers.values()) {
            System.out.println("Компьтер: " + x.name());
            System.out.println("Название процессора: " + x.pr.getName() + " Память: " +
                    x.mem.getMemory() + " Разрешение монитора: " + x.mona.getWidth() + "x" + x.mona.getHeight() + "\n");
        }
    }
}
