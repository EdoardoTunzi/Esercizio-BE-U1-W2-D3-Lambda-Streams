package be.esercizi;

import be.esercizi.classi.Customer;
import be.esercizi.classi.Order;
import be.esercizi.classi.Product;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class GestioneEsercizi {


    public static void main(String[] args) {
        /*//Prodotti
        Product prod1 = new Product(1, "Libro1", "Books", 120.2);
        Product prod2 = new Product(2, "Libro2", "Books", 11.2);
        Product prod3 = new Product(3, "Libro3", "Books", 101.5);
        Product prod4 = new Product(4, "Giocattolo", "Boys", 100.0);
        Product prod5 = new Product(5, "Pannolini", "Baby", 15.99);
        Product prod6 = new Product(6, "Biberon", "Baby", 8.49);
        Product prod7 = new Product(7, "Giocattolo", "Boys", 12.99);

        //Clienti
        Customer customer1 = new Customer(1, "Mario Rossi", 1);
        Customer customer2 = new Customer(2, "Giuseppe Verdi", 2);
        Customer customer3 = new Customer(2, "Marco Verdi", 2);
        Customer customer4 = new Customer(2, "Francesco Verdi", 2);

        //Ordini
        Order order1 = new Order(
                1,
                "Shipped",
                LocalDate.of(2025, 1, 10),
                LocalDate.of(2025, 1, 15),
                Arrays.asList(prod1, prod3),
                customer1
        );

        Order order2 = new Order(
                2,
                "Processing",
                LocalDate.of(2025, 1, 12),
                LocalDate.of(2025, 1, 20),
                Arrays.asList(prod2, prod5),
                customer2
        );

        Set<Product> productList = new HashSet<Product>(Set.of(prod1, prod2, prod3, prod4, prod5, prod6, prod7));
        Set<Order> orderList = new HashSet<Order>(Set.of(order1, order2));

        //------------------------Esercizio1--------------------
        System.out.println("Esercizio1:");
        //Creo stream
        Stream<Product> booklistStream = productList.stream();
        booklistStream
                .filter(product -> "Books".equals(product.category))
                .filter(product -> product.price > 100)
                .forEach(product -> System.out.println("Nome: " + product.name + " Prezzo: " + product.price + " Categoria: " + product.category));

        //------------------------Esercizio2-----------------------
        System.out.println("Esercizio2:");
        //Creo stream
        Stream<Order> babyOrderListStream = orderList.stream();
        babyOrderListStream
                .filter(order -> order.products.stream().anyMatch(product -> "Baby".equals(product.category)))
                .forEach(order -> {
                    System.out.println("OrderID: " + order.id + " Status: " + order.status);
                    order.products.stream()
                            .filter(product -> "Baby".equals(product.category))
                            .forEach(product -> System.out.println("Nome: " + product.name + " Prezzo: " + product.price + " Categoria: " + product.category));
                });

        //------------------------Esercizio3-----------------------
        System.out.println("Esercizio3:");
        //Creo stream
        Stream<Product> boysListStream = productList.stream();
        boysListStream
                .filter(product -> "Boys".equals(product.category))
                .forEach(product -> {
                    product.price -= (product.price * 10) / 100;
                    System.out.println("Nome: " + product.name + " Prezzo: " + product.price + " Categoria: " + product.category);
                });
        //------------------------Esercizio4-----------------------
       *//* System.out.println("Esercizio4:");
        Stream<Order> ordersByTier = orderList.stream();
        ordersByTier
                .filter(order -> order.customer.tier == 2)
                .filter(order -> order.orderDate)*/
    }
}