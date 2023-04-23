class DefineFigureTest {
    public static void main(String[] args) {

        System.out.print ("Name of the figure: ") ;
        new  DefineFigure().define(new Cylinder());

        System.out.print ("Name of the figure: ") ;
        new  DefineFigure().define(new Triangle());

        System.out.print ("Name of the figure: ") ;
        new  DefineFigure().define(new Rectangle());
    }
}
