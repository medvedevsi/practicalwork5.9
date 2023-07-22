public class Elevator {
    int currentFloor = 1, minFloor = 0, maxFloor = 17;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor(){return currentFloor;}

    public void moveDown(){currentFloor--;}

    public void moveUp(){currentFloor++;}

    public void move(int floor){
        int distance = currentFloor - floor;

        if (floor < minFloor || floor > maxFloor){
            System.out.println("Неверно задан этаж");
            return;
        }
        while (distance != 0){
            if (distance < 0){moveUp();}
            else{
                moveDown();
            }
            distance = currentFloor - floor;
            System.out.println("Текущий этаж: "+currentFloor);
        }
    }
}
