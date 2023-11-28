import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(30, 27, 4, 6, 1));

        Set<String> set1 = new HashSet<>(Arrays.asList("hello", "world", "eou"));
        System.out.println(set);
        System.out.println(set1);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList("hello", " world", "from", "my", "project"));
        System.out.println("linkedhashset" + linkedHashSet);


        TreeSet<String> linkedList = new TreeSet<>(Arrays.asList("hello", " world", "from", "my", "project"));
        System.out.println("TreeSet" + linkedList);

        Set<Integer> set2 = new HashSet<>(Arrays.asList(30, 45, 22, 27));
        for (Integer integer : set2) {
            if (integer == 27) {
                System.out.println(integer);

            }
        }
        Iterator<Integer> iterator = set2.iterator();
        while (iterator.hasNext()) {
            int a = iterator.next();
            if (a == 27) {
                System.out.println(a);
            }
        }


        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int summa = 0;
        for (int i = 0; i < 400; i++) {
            arrayList.add(random.nextInt(0, 20));
            summa = summa + arrayList.size();
            System.out.println(arrayList.get(i)+" ");
        }
        System.out.println("Arraylist: " + summa);


        Set<Integer> set4 = new HashSet<>();
        for (int i = 0; i < arrayList.size(); i++) {
            set4.add(arrayList.get(i));
        }
        System.out.println(set4);
        int summa1 = 0;
        for(Integer integer: set4){
            summa1+=integer;
        }
        System.out.println("HashSet: "+summa1);

int a=10;
if(a==10){

}
    }






}