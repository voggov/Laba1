import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ArrCoordinates<T> {
    public ArrayList<T> list = new ArrayList<T>();

    public ArrCoordinates(T coord){
        list.add(coord);
    }

    public void addMember(T coordinates){
        list.add(coordinates);
    }

}
