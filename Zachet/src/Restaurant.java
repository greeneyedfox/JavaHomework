public class Restaurant {
    int id;
    String name;
    int total;

    public Restaurant(String name){
        this.id = (int)Math.round(Math.random()*1000);
        this.name = name;
        this.total = 0;
    }

    public void order(String name, int price){
        this.total += price;
    }



    public void completeOrder(Table table){
        table.flag = false;
    }
}
