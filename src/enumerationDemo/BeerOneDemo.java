package enumerationDemo;

public enum BeerOneDemo {
    KO(45),KF(85),RC,Wis
            {
                public int printvalue(){
                    System.out.println("hello");
                    return 1025;
                }
            };
    int x;
    BeerOneDemo(int x){
        System.out.println("This is Comstructor BeerOneDemo Of Enum::"+x);
        this.x=x;
    }
    BeerOneDemo(){
        this.x=15;
        System.out.println("This is Comstructor BeerOneDemo Of Enum");
    }
    public int printvalue(){
        return x;
    }
}
