package com.nslearning.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ProductImpl {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<>();
		// Adding Products
		productsList.add(new Product(1, "Motorola M5", 10000f));
		productsList.add(new Product(2, "OnePlus Nord", 30000f));
		productsList.add(new Product(3, "Samsung Galaxy", 45000f));
		productsList.add(new Product(4, "Redmi Note", 12000f));
		productsList.add(new Product(5, "iPhone 13", 90000f));

		// stream filters
		List<Product> expensiveMobiles = productsList.stream().filter(p -> p.getPrice() > 20000)
				.collect(Collectors.toList());
		System.out.println("Expensive Mobiles : " + expensiveMobiles);
		
		// filtering and mapping (method reference)
		List<Float> cheapMobilePriceList = productsList.stream().filter(p -> p.getPrice() < 20000)
				.map(Product::getPrice).collect(Collectors.toList());
		System.out.println("Cheap Mobile price list : " + cheapMobilePriceList);
		
		// Stream comparison and limiting
		Collections.sort(productsList, (p1, p2) -> {
			return p1.getName().compareTo(p2.getName());
		});
		productsList.stream().limit(3).forEach(System.out::println);
		
		// stream reduce
		float totalPriceOfProducts = productsList.stream().map(Product::getPrice).reduce(0.0f, Float::sum);
		System.out.println("Total Price of all products : " + totalPriceOfProducts);
		
		// find max and min using streams
		Product maxProduct = productsList.stream().max((p1,p2) -> p1.getPrice() > p2.getPrice() ? 1: -1).get();
		System.out.println("Max Product : " + maxProduct);
		
		Product minProduct = productsList.stream().max((p1,p2) -> p1.getPrice() < p2.getPrice() ? 1: -1).get();
		System.out.println("Min Product : " + minProduct);
		
		// stream count
		
		long countOfExpensiveProducts = productsList.stream().filter(p->p.getPrice()>20000).count();
		System.out.println("Count of Expensive Products :" + countOfExpensiveProducts);
		
		// convert list to set/map using streams
		Set<Float> priceSet = productsList.stream().filter(p -> p.getPrice() > 20000).map(Product::getPrice).collect(Collectors.toSet());
		System.out.println("Price Set : " + priceSet);

		Map<String, Float> productMap = productsList.stream().collect(Collectors.toMap(Product::getName, Product::getPrice));
		System.out.println("Product Map : " + productMap);

	}

}