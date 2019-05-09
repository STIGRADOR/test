package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		enter(); // Получение доступа к пользованию программой.
		System.out.println("Введите число, которое хотите возвести в степень: ");
		int chislo = scan(); // Вызывается функция, которая считывает введенное значение и записывает его в переменную.
		System.out.println("Укажите степень, в которую необходимо возвести число " + chislo + ":");
		int stepen = scan(); // Вызывается функция, которая считывает введенное значение и записывает его в переменную.
		int result = vozved(chislo, stepen); //Вызывается ифункция, которая возводит числ ов степень и выводится результат на экран.
		System.out.print("Результат возведения числа " + chislo);
		System.out.println(" в степень " + stepen + ": " + result + "!\n");
		srav_if(result); // Сравниваем результат возведения в степень с числом 81 оператором if.
		srav_while_plus_if(result); // Сравниваем результат возведения в степень с числом 81 оператором switch.*/
	}

	// Функция возведения в степень.
	public static int vozved(int chislo, int stepen) {
		int result = 1;
		for (int i = 0; i < stepen; i++) {
			result = result * chislo;
		}
		return result;
	}

	// Функция, считывающая целочисленное значение.
	public static int scan() {
		Scanner chit = new Scanner(System.in);
		int itog;
		itog = chit.nextInt();
		return itog;
	}

	// Функция сравнения результата возведения относительно числа 81 оператором if.
	public static void srav_if(int result) {
		if (result > 81) {
			System.out.println("Сравнение оператором if:\n");
			System.out.println("Результат возведения в степень больше 81.\n");
		}
		if (result == 81) {
			System.out.println("Сравнение оператором if:\n");
			System.out.println("Результат возведения в степень равен 81.\n");
		}
		if (result < 81) {
			System.out.println("Сравнение оператором if:\n");
			System.out.println("Результат возведения в степень меньше 81.\n");
		}
	}

		// Функция сравнения результата возведения относительно числа 81 циклом while и оператором if.
	public static void srav_while_plus_if (int result){
		boolean isTrue = true;
		char x = 'y';
		while (isTrue && x == 'y') {
			if (result < 81) {
				System.out.println("Сравнение циклом while и оператором if:\n");
				System.out.println("Результат возведения в степень меньше 81.\n");
				isTrue = false;
			}
			if (result > 81) {
				System.out.println("Сравнение циклом while и оператором if:\n");
				System.out.println("Результат возведения в степень больше 81.\n");
				x = 'z';
			}
			if (result==81){
				System.out.println("Сравнение циклом while и оператором if:\n");
				System.out.println("Результат возведения в степень равно 81.\n");
				break;
			}
		}
	}

	// Получение доступа к пользованию программой через двумерный массив.
	public static void enter(){
		int [] name = new int[1];
		int [] pass = new int[1];
		boolean isTrue = true;
		while (isTrue){
			System.out.println("***Подтвердите наличие прав доступа!***\n");
			System.out.print("Введите имя пользователя: ");
			Scanner name1 = new Scanner(System.in);
			name[0] = name1.nextInt();
			System.out.println("\n");
			System.out.print("Введите пароль: ");
			pass[0] = name1.nextInt();
			System.out.println("\n");
			if (name[0]==1 && pass[0]==2){
				System.out.println("Добро пожаловать, мой повелитель!\n");
				isTrue=false;
			}
			else {
				System.out.println("Прочь, нечистый!!!\n");
			}
		}
	}
} // конечная