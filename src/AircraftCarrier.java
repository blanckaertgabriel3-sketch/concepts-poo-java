import java.util.ArrayList;

public class AircraftCarrier{
    public ArrayList<Plane> planesList = new ArrayList<>();

    public String printList() {
        ArrayList<String> infos = new ArrayList<String>();
          for(Plane p: planesList) {
              infos.add(p.info());
          }
        return (""+ infos).replace(",","\n");
    }

}
