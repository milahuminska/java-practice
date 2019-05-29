package oca_prep04;

public class Comments {
	

	
	
	
	//Access Modifier   Specific    return-type    methodname
	public               static     void           methodname(String str) {}
// 
	//1.methods:
	
	//Access Modifier   Specific    return-type    methodname
	//optinal            optinal      requied     required
	
	
	// Access modifiers: public, pritected, dafault, private
	// specifer: static, final, abstract
	// return-type: void, primitives, classes and object
	
	
	/*
	 * 2.constructor
	 * 
	 * Aceess modifier     ClassName
	 * optinal              required
	 */
	
	
	
//	 Constructor:   special method. execution depends on the creation of the object
	
//	1. every class MUST have constructor, if there isn't any then compiler will give default constructor(no-arg constructor)  
	
//	2. constructor' method CAN NOT have Return-Type and specifier
	
//	3. constructor' method name MUST be same with className
	
//	4. constructor' execution depends on the creation of the object
	
//	5. Constructor can only be called in another constructor, other methods cannot call the constructor
	
//	6. constructor CAN NOT be called by method name, MUST use this or super (to call superclass' constructor) keywords.
	
//	7. constructor CAN NOT call itself
	
//	8. constructor CAN NOT call more than one constructor
	
//	9. in constructor' body  constructor call needs to be the first step.
	
//	10. every class MUST have constructor, if there isn't any then compiler will give default constructor(no-arg constructor)
	
//	11. class' object MUST be created with the existing constructors 
//	
//	12. super class' default constructor (no-arg) is called in sub class' constructor(any constructor) by default 
	
//	13. super class' constructor ( except for default) MUST be called in sub class' 
//				(if there is no default constructor in super class)
//	
//	
//	
//	 
//	
	
	
	
	
//	 OOP: object Oriented programming
//	 		4 main concepts are : Encapsulation, Inheritance, Abstraction, Polymorphisim
//	 		
//	 1. Encapsulation: hides the instance variables ( usually have private access modifiers )
//	 
//				 getter: Read ONLY
//				 	1. return method ( Return-Type cannot be void)
//				 	2. access modifier Should not be private
//				 	3. return Type must be same data-type with the instance variable'
//				 	4. does not have any argument
//				 	
//				 	
//				 Setter: Modify
//				 	1. none return method ( void)
//				 	2. must have an argument and argument' data-type MUST be same with instance variable'
//				 	3. argument must be initialized to the instance variable
//}
}
