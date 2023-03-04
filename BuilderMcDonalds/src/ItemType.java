import java.util.ArrayList;
import java.util.List;
public class ItemType {
    private List<Packing> items=new ArrayList<Packing>();
    public void addItem(Packing packs) {
        items.add(packs);
    }
    public void getCost(){
        for (Packing packs : items) {
            packs.price();
        }
    }
    public void showItems(){
        for (Packing packing : items){
            System.out.print("Nombre de Paquete : "+packing.pack());
            System.out.println(", Artículos : "+packing.price());
        }
    }
}//End of the CDType class.  