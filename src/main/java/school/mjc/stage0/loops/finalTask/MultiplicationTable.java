package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){

        StringBuilder table = new StringBuilder();
        for (int i = 1; i <= 10 ; i++) {
            table.append(i).append(" x ").append(numberTableToPrint).append(" = ").append(numberTableToPrint * i).append("\n");
        }
        System.out.println(table.substring(0, table.length() - 1));
    }
}
