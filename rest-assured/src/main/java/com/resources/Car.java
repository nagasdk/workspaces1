package com.resources;

public class Car{
		public Car(String color, double price, String model, String brand) {
			super();
			this.color = color;
			this.price = price;
			this.model = model;
			this.brand = brand;
		}
		String color;
		double price;
		String model;
		String brand;
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
	}