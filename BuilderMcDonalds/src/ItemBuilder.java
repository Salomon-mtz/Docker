public class ItemBuilder {
    public ItemType buildSonyCD(){
        ItemType cds=new ItemType();
        cds.addItem(new Pack1());
        return cds;
    }
    public ItemType buildSamsungCD(){
        ItemType cds=new ItemType();
        cds.addItem(new Pack2());
        return cds;
    }
}// End of the CDBuilder class.