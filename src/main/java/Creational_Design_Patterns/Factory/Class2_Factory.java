package Creational_Design_Patterns.Factory;

public class Class2_Factory implements FactoryMehtod {
    @Override
    public void car() {
        System.out.println("Mercedez_Benz");
    }
}
class Type
{
    public FactoryMehtod getType(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("MERCEDEZ_BENZ")){
            return new Class2_Factory();

        } else if(shapeType.equalsIgnoreCase("BMW")){
            return new Class1_Factory();

        }
        return null;
    }
}
class FactoryPatternDemo {

    public static void main(String[] args) {

    Type type=new Type();
    FactoryMehtod factoryMehtod= type.getType("BMW");
    factoryMehtod.car();
    FactoryMehtod factoryMehtod1=type.getType("MERCEDEZ_BENZ");
    factoryMehtod1.car();

    }
}
