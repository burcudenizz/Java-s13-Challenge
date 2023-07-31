package enums;

public enum Plan {
 SIMPLE("SIMPLE",1000),
 MIDDLE("MIDDLE",2000),
 ADVANCED("ADVANCED",3000);


 private String name;
 private int price;


 Plan(String name,int price){
     this.name=name;
     this.price=price;
 }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
