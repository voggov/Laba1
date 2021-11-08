import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void printXY(ArrayList<TwoDimens> arr) {
        int index = 0;
        for (TwoDimens i : arr) {
            System.out.print(arr.get(index).getX() + "\t");
            System.out.print(arr.get(index).getY() + "\n");
            index++;
        }
    }

    public static void printXYZ(ArrayList<ThreeDimens> arr) {
        int index = 0;
        for (TwoDimens i : arr) {
            try {
                System.out.print(arr.get(index).getX() + "\t");
                System.out.print(arr.get(index).getY() + "\t");
                System.out.print(arr.get(index).getZ() + "\n");
                index++;
            } catch (Exception e){
                System.out.println("элемент не имеет Координаты Z");
                index++;
            }


        }
    }


    public static void main(String[] args) {
        FourDimens mas = new FourDimens();
        mas.setX(4);
        mas.setY(5);
        mas.setZ(14);

        TwoDimens mas2 = new TwoDimens();
        mas2.setX(2);
        mas2.setY(7);

        ThreeDimens mas3 = new ThreeDimens();
        mas3.setX(48);
        mas3.setY(54);
        mas3.setZ(20);

        ArrCoordinates arrCoordinates = new ArrCoordinates(mas);
        arrCoordinates.addMember(mas2);
        arrCoordinates.addMember(mas3);


        printXY(arrCoordinates.list);
        System.out.println("//////////////////////////////////////////");
        printXYZ(arrCoordinates.list);
    }
}
