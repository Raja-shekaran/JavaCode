package practise;


import java.util.ArrayList;
import java.util.List;

public class DesignPatterns {
    public static void main(String[] args) {
        //Singleton - Only one reference is created and is globally available
        SingletonExample exampleObj = SingletonExample.getInstance();
        exampleObj.connectToDB();

        //Factory Pattern - Abstracts the object creation logic from client
        DishFactory factory = FactoryProducer.getFactory("pizza");
        Dish dish = factory.createDish();
        dish.prepare();
        dish.server();

        //Builder Pattern - that separates the construction of complex objects from their representation
        Post post = new Post.Builder()
                .title("Java Builder Pattern")
                .text("Explaining how to implement the Builder Pattern in Java")
                //.category("Programming")
                .build();

        System.out.println(post.getCategory());//null

        //Strategy Pattern - More than one operation or behaviour without changing code
        int[] arr = {1,2,3,4,5,10,11,12};
        SortingContext sortingContext = new SortingContext(new BubbleSort());
        int[] array1 = {5, 2, 9, 1, 5};
        sortingContext.performSort(array1);

        //Observer Pattern
        WeatherStation weatherForecast = new WeatherStation();
        Observer mobile = new MobileNotification();
        Observer laptop = new LaptopNotification();

        weatherForecast.addObserver(mobile);
        weatherForecast.addObserver(laptop);

        weatherForecast.setWeather("Sunny");

        weatherForecast.removeObserver(mobile);

        weatherForecast.setWeather("Rainy");

    }
}

//Observer Pattern
// Observer Interface
interface Observer {
    void update(String weather);
}

// Subject Interface
interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

class WeatherStation implements Subject{
    private String weather;
    List<Observer> observersList = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
       this.observersList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observersList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observersList) {
            observer.update(weather);
        }
    }

    public void setWeather(String newWeather) {
        this.weather = newWeather;
        notifyObservers();
    }
}

class MobileNotification implements Observer{

    private String weather;
    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }

    public void display(){
        System.out.println("Phone Display: Weather updated - " + weather);
    }
}

class LaptopNotification implements Observer{

    private String weather;
    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }

    public void display(){
        System.out.println("Laptop Display: Weather updated - " + weather);
    }
}

//Strategy Pattern
//Strategy Interface
interface SortingStrategy{
    void sort(int[] arr);
}

class SelectionSort implements SortingStrategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("Selection Sort");
    }
}

class BubbleSort implements SortingStrategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("Quick Sort");
    }
}

class SortingContext {
    private SortingStrategy sortingStrategy;

    public SortingContext(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void performSort(int[] array) {
        sortingStrategy.sort(array);
    }
}


//Builder
class Post {
    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getCategory() {
        return category;
    }

    private final String title;

    private final String text;

    private final String category;

    Post(Builder builder) {
        this.title = builder.title;
        this.text = builder.text;
        this.category = builder.category;
    }

    public static class Builder {
        private String title;
        private String text;
        private String category;

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder text(String text) {
            this.text = text;
            return this;
        }

        public Builder category(String category) {
            this.category = category;
            return this;
        }

        public Post build() {
            return new Post(this);
        }
    }
}

//Factory Pattern - 4 Components
//Product Interface
interface Dish {
    void prepare();
    void server();
}
//Concrete Products
class Pizza implements Dish{

    @Override
    public void prepare() {
        System.out.println("Preparing Pizza");
    }

    @Override
    public void server() {
        System.out.println("Pizza Served");
    }
}
class Burger implements Dish{

    @Override
    public void prepare() {
        System.out.println("Preparing Burger");
    }

    @Override
    public void server() {
        System.out.println("Burger Served");
    }
}

//Factory interface
interface DishFactory{
    Dish createDish();
}

//Concrete factory
class PizzaFactory implements DishFactory{

    @Override
    public Dish createDish() {
        return new Pizza();
    }
}

class BurgerFactory implements DishFactory{

    @Override
    public Dish createDish() {
        return new Burger();
    }
}

// Factory Producer (returns factory based on input)
class FactoryProducer {
    public static DishFactory getFactory(String input) {
        if (input.equalsIgnoreCase("pizza")) {
            return new PizzaFactory();
        } else if (input.equalsIgnoreCase("burger")) {
            return new BurgerFactory();
        }
        throw new IllegalArgumentException("Unknown dish type: " + input);
    }
}


//Singleton Pattern
class SingletonExample {
    //Private Static Attribute
    private static SingletonExample singletonExample;
    //Private Constructor
    private SingletonExample(){
    }

    //Public Static getInstance - Adding synchronized makes it thread safe
    public static synchronized SingletonExample getInstance(){
        if(singletonExample==null){
            singletonExample = new SingletonExample();
        }
        return singletonExample;
    }

    public void connectToDB(){
        System.out.println("Connected");
    }
}