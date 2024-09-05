public class playinstrument {
    public static void main(String[] args) {
        instrument a = new instrument("guitar", 101.5);
        instrument b = new instrument("Piano", 200.0);
        instrument c = new instrument("Violin", 150.9);


        a.setType("Guitar");
        a.setPrice(101.5);

        b.setType("Piano");
        b.setPrice(200.0);

        c.setType("Violin");
        c.setPrice(150.9);

        if (a.getPrice() > b.getPrice() && a.getPrice() > c.getPrice()) {
            System.out.println("harga paling mahal adalah guitar");
        } else if (b.getPrice() > a.getPrice() && b.getPrice() > c.getPrice()) {
            System.out.println("harga paling mahal adalah piano");
        } else {
            System.out.println("harga paling mahal violin");
        }

        if (a.getPrice() < b.getPrice() && a.getPrice() < c.getPrice()) {
            System.out.println("harga paling murah adalah guitar");
        } else if (b.getPrice() < a.getPrice() && b.getPrice() < c.getPrice()) {
            System.out.println("harga paling murah adalah piano");
        } else {
            System.out.println("harga paling murah violin");
        }

        a.print(); 
        b.print(); 
        c.print(); 




    }
}
