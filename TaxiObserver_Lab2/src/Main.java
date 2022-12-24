public class Main {
    public static void main(String[] args) {
        PosData posData = new PosData();
        PosDisplay statisticsDisplay = new PosDisplay(posData);
        float max = 100, min = 0;
        posData.setLoc(new float[]{15, 65}, true);
        while (true) {
            float randomX = (float) (min + Math.random() * (max - min));
            float randomY = (float) (min + Math.random() * (max - min));

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            posData.setLoc(new float[]{randomX, randomY}, true);
        }

    }
}