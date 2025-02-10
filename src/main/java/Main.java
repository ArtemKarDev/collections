import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Cat cat = new Cat("Vasya", 10, 5.5,new ArrayList<>(Arrays.asList("Anton", "Oleg", "Igor")));
        setNullToFieldsClass(cat);
    }

    public static void setNullToFieldsClass(Object obj){
        Class<?> someClass = obj.getClass();

        System.out.println("Объект до обнуления: "+obj);

        for(Field field: someClass.getDeclaredFields()){
            try {

                field.setAccessible(true);
                if (!field.getType().isPrimitive()) {
                    System.out.println("Обнуляем поле "+ field.getName()+" с типом "+field.getType());
                    field.set(obj, null);
                } else {System.out.println("Не обнуляем поле "+ field.getName()+" с типом "+field.getType());}
            } catch (IllegalAccessException ignored){
            }
        }
        System.out.println("Объект после обнуления: "+obj);
    }

}