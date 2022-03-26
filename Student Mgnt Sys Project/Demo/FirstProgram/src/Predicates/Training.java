package Predicates;

import java.util.function.IntPredicate;

public class Training {

	public static void main(String[] args) {

		IntPredicate lessThan18 =i->i<18; 
		IntPredicate MoreThan18= i->i>18; 

		System.out.println(lessThan18.and(MoreThan18).test(45));
		}
	}

