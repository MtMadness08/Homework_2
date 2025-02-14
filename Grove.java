public class Grove {
    public Tree treeArray[];
    public String GroveName;

    public Grove(){
        treeArray = new Tree[16];
    }

    public Grove(String GroveName){
        treeArray = new Tree[16];
        this.GroveName = GroveName;
    }

    public int plantTree(Tree plant){
        for (int i = 0; i < treeArray.length; i++){
            if(treeArray[i] == null){
                treeArray[i] = plant;
                return i;
            }
        }
        return -1;
    }

    public Tree removeTree(int plot){
        Tree plant = treeArray[plot];
        treeArray[plot] = null;
        return plant;
    }

    public String toString(){
        int numberOfTrees = 0;
        for (int i = 0; i < treeArray.length; i++){
            if(treeArray[i]!= null){
                numberOfTrees++;
            }
        }
        return "Number of Trees in Grove: " + numberOfTrees;
    }
}