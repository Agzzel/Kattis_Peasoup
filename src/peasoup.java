import java.util.*;

public class peasoup {
    public static void main(String[] args) {
        int n; // number of restaurants
        int k; // number of dishes on the menu
        final String pancakes = "pancakes";
        final String peaSoup = "pea soup";
        LinkedHashMap<String, ArrayList<String>> map = new LinkedHashMap<>();

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");// allows input of strings on several lines
        n = sc.nextInt();

        for(int i = 0; i < n; i++){ // for every restaurant
            ArrayList<String> menu = new ArrayList<>();
            k = sc.nextInt();
            String restaurantName = sc.next();
            for(int j = 0; j < k; j++){
                String menuDish = sc.next();
                menu.add(menuDish);
            }
            map.put(restaurantName, menu);
        }
        for(Map.Entry<String, ArrayList<String>> entry : map.entrySet()){
            if(entry.getValue().contains(peaSoup) && entry.getValue().contains(pancakes)){
                System.out.println(entry.getKey());
                return;
            }
        }
        System.out.println("Anywhere is fine I guess");
    }
}
