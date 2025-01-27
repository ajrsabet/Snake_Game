package util;

public class TypeWriter {
    public void SlowType(String line) {
        int delay = 10;

        for (int i = 0; i < line.length(); i++) {
            System.out.print(line.charAt(i));
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();
    }
}
