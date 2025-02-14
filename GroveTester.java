public class GroveTester{
    public static void main(String[] args){
        Grove Grove1 = new Grove();
        System.out.println(Grove1);

        for (int i = 0; i<6; i++){
        Tree spruce = new Tree(i, 37,"Spruce");
        Grove1.plantTree(spruce);
        }
        System.out.println(Grove1); 

        Grove1.removeTree(3);
        Grove1.removeTree(5);
        System.out.println(Grove1);

        Tree maple = new Tree(7,13,"Maple");
        Grove1.plantTree(maple);
        System.out.println(Grove1);        
    }
}