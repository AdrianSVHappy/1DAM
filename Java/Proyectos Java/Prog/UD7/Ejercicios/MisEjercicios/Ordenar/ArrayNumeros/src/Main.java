import java.util.ArrayList;
import java.util.Collections;

/**
 * <h1>Name.java</h1><hr>
 * <p>Esta clase represanta </p>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 21-may-2024
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<Integer>();


        for (int i = 0; i < ((int) (Math.random() * 10) +3); i++) {

            nums.add((int) (Math.random() * 15));

        }

        for (Integer num : nums) {
            System.out.println(num);
        }


        System.out.println("---------------------");
        //ordenar(nums, -1);
        Collections.sort(nums.reversed());


        for (Integer num : nums) {
            System.out.println(num);
        }


    }


    /**
     * Ordena un Array list de enteros
     * @param nums Array list
     * @param indice int. Para establecer el orden: 1 -> de menor a mayor / -1 -> de mayor a menor
     */
    private static void ordenar (ArrayList<Integer> nums, int indice){

        int aux;

        if (indice > 1)
            indice = 1;
        else if (indice < -1)
            indice = -1;


        for(int i = 0; i < (nums.size()-1); i++) {

            for (int j = (i + 1); j < nums.size(); j++) {

                if (nums.get(i).compareTo(nums.get(j)) == indice) {

                    aux = nums.get(i);
                    nums.set(i, nums.get(j));
                    nums.set(j, aux);
                }
            }
        }



    }
}