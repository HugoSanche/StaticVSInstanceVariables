public class Test {
    public static void main(String[] Args){

        Dog oso = new Dog("Osito");
        Dog cuquis=new Dog("Cuquis");

        //Ejemplo de no ocupar una variable static si vas a ocupar referencia
        //en este caso name en la clase Dog
        oso.print(); //imprime Cuquis
        cuquis.print(); //imprime Cuquis

    }
}
    
