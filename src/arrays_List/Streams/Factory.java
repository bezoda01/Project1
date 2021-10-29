package arrays_List.Streams;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Factory {
    public static void main(String[] args) {
        ArrayList<Cars> list = new ArrayList<>();
        Collections.addAll(list,
                new Cars("Electro", "Tesla", "Y", 505000),
                new Cars("Gas", "BMW", "X6", 2420000),
                new Cars("Electro", "Tesla", "F2", 1600000),
                new Cars("Electro", "Tesla", "H3", 800000),
                new Cars("Gas", "BMW", "X5", 950000)
        );


        printTeslaCar(list);
        System.out.println();
        printBMWCar(list);
        System.out.println();
        sortPriceCars(list).forEach(System.out::println);

    }

    public static void printTeslaCar(ArrayList<Cars> list)
    {
        list.stream()
                .filter(s -> s.getCarBrand().equals("Tesla"))
                .forEach(System.out::println);
    }

    public static void printBMWCar(ArrayList<Cars> list)
    {
        list.stream()
                .filter(s -> s.getCarBrand().equals("BMW"))
                .forEach(System.out::println);
    }

    public static ArrayList<Cars> sortPriceCars(ArrayList<Cars> list)
    {
        ArrayList<Cars> newList = (ArrayList<Cars>) list.stream()
                .sorted((s1, s2) -> s2.getPrice() - s1.getPrice())
                .collect(Collectors.toList());
        return newList;
    }
}

    class Cars {
        public String getCarBrand() {
            return carBrand;
        }
        public int getPrice() {
            return price;
        }
        public String getVehicle() {
            return vehicle;
        }
        public String getModel() {
            return model;
        }

        private String carBrand;
        private String vehicle;
        private String model;
        private int price;

        public Cars(String vehicle, String carBrand, String model, int price) {
            this.vehicle = vehicle;
            this.carBrand = carBrand;
            this.model = model;
            this.price = price;
        }

        public String toString() {
            return "Тип автомобиля: " + vehicle + ", модель: " + carBrand + " " + model + " " + ", цена: " + price + " USD.";
        }
    }
