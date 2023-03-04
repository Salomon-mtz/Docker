public class BuilderDemo{
    public static void main(String args[]){
        ItemBuilder cdBuilder=new ItemBuilder();
        ItemType cdType1=cdBuilder.buildSonyCD();
        cdType1.showItems();

        ItemType cdType2=cdBuilder.buildSamsungCD();
        cdType2.showItems();
    }
}