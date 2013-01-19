package com.gmail.dailyefforts.java.json;

import java.util.List;

import com.google.gson.Gson;

class Apple {
	private String color;
	private float weight;

	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + "]";
	}
}

class Basket {
	private List<Apple> basket;

	public List<Apple> getBasket() {
		return basket;
	}
}

public class JsonParser {
	/**
	 * <pre>
	 * {
	 * "basket":
	 * [
	 * 	{"color": "green", "weight": 0.2},
	 * 	{"color": "red", "weight": 0.5},
	 * 	{"color": "yellow", "weight": 0.3}
	 * ]
	 * }
	 * </pre>
	 */
	private static String json = "{\"basket\":"
			+ "[{\"color\": \"green\", \"weight\": 0.2},"
			+ "{\"color\": \"red\", \"weight\": 0.5},"
			+ "{\"color\": \"yellow\", \"weight\": 0.3}]}";

	public static void main(String[] args) {
		Gson gson = new Gson();

		// json > object
		Basket basket = gson.fromJson(json, Basket.class);

		List<Apple> list = basket.getBasket();

		// test the result
		for (Apple apple : list) {
			System.out.println(apple.toString());
		}
	}
}
