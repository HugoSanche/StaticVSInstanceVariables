public class Dog{
    private static String name;


    public Dog(String name) {
        Dog.name=name;  //al llamar un metodo o variable static 
                        //se llama con el nombre de la clase en este caso Dog
    }

    //remeber if you used a instance variable in the static method its better use
    //reference method (no static method)
    //in this exaple i used instance variable "name" in static method its incorrect
    public static void print(){
        System.out.println("Mi nombre es "+Dog.name);
    }
}

