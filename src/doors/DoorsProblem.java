package doors;

public class DoorsProblem {
    public static void main(String[] args) {
        int number = 100;
        int iterationNum = 100;
        Door[] doors = new Door[number];
        for (int i = 0; i < number; i++) {
            doors[i] = new Door((i + 1), false);
        }

        for (int i = 0; i < iterationNum; i++) {
            setDoors((i+1), iterationNum, doors);
        }


        for(int i = 0; i < doors.length ; i++) {
            System.out.print(doors[i].getNumber());
            if(doors[i].isOpened()) {
                System.out.print("  opened     ==>" );
            } else {
                System.out.print("  closed");
            }
            System.out.println();
        }
    }

    private static void setDoors(int iterate, int totalIterations, Door[] doors) {
        for (int i = iterate; i <= totalIterations; i++) {
            if( (i % iterate ) == 0) {
                doors[i-1].setOpened(!doors[i-1].isOpened());
            }
        }

    }
}
