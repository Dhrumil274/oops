class distance{
    int feet;
    int inches;

    distance(){
        this(5);
    }

    distance(int feet){
        this.feet = feet;
        this.inches = 5;
    }

    distance(distance d){
        this.feet = d.feet;
        this.inches = d.inches;
    }
    void display(){
        System.out.println("feet " +  feet  + " inches " + inches);

    }
    public static void main(String[] args){
        distance d1 = new distance();
        distance d2 = new distance(10);
        distance d3 = new distance(d2);
        d1.display();
        d2.display();
        d3.display();
    }
}
