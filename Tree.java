public class Tree {
    public int idNumber;
    public int age;
    public String speciesName;

    public Tree(){
        idNumber = 0;
        age = 0;
        speciesName = "Oak";
    }

    public Tree(int idNumber, int age, String speciesName){
        this.idNumber=idNumber;
        this.age = age;
        this.speciesName = speciesName;
    }

    public String toString(){
        return "ID Number:" + idNumber + "Age:" + age + "Species Name:" + speciesName;
        }

    }