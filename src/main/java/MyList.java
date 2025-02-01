import java.util.ArrayList;
import java.util.List;
public class MyList{

    int number;
    List<Integer> intList;

    public MyList(int number) throws IllegalArgumentException{
        if (number%2 == 0 ){
            this.intList = new ArrayList<>(number);
            this.intList = createMyList(number);
        } else {throw new IllegalArgumentException("Число должно быть четным!");}
    }

    private List<Integer> createMyList(int number){
        int a,b;
        List<Integer> newList = new ArrayList<>(number);
        for (int i = 0; i < number; i++){
            newList.add(i);
        }
        for (int i = 0; i< number; i += 2){
            a = newList.get(i);
            b = newList.get(i + 1);
            newList.set(i+1,a);
            newList.set(i,b);
        }
        return newList;
    }

    public String toString(){
        return intList.toString();
    }

}