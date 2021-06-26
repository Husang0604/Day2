import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Food pasta = new Food("pasta", "Italy");
        //System.out.println(pasta.getName());
        Food kimbob = new Food("kimbob", "South Korea");
        //System.out.println(kimbob.getName());
        Food cheesecake = new Food("Cheesecake", "England");
        ArrayList<Food> foodList = new ArrayList<Food>();
        foodList.add(pasta);
        foodList.add(kimbob);
        foodList.add(cheesecake);

        pasta.setDate(10);
        kimbob.setDate(100);
        cheesecake.setDate(1970);

        for(int i = 0; i < foodList.size(); i++) {
            foodList.get(i).printAllProperties();
        }        
        // pasta.printAllProperties();
        // kimbob.printAllProperties();
        // cheesecake.printAllProperties();


    }
}

class Food {
    private String country;
    private String title;
    private int date;

    Food(String _foodName, String _countryName) {
        title = _foodName;
        country = _countryName;
    }
    

    public String getName() {
        return title;
    }
    public void setName(String _name) {
        title = _name;
    }

    public void setDate(int _date) {
        date = _date;
    }


    public void printAllProperties() {
        System.out.println(title);
        System.out.println(country);
        System.out.println(date);
    }

}
