package ua.lgs.lviv;

import java.util.Arrays;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class Application {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {

		Class personClass = University.class;
		Class personClassFaculty = Faculty.class;
		
		
		//getting the name of our class
		System.out.println("The name of our class ---> " + personClass.getName());  
		System.out.println("The simple name of our class ---> " + personClass.getSimpleName());
		
		
		//getting the modifiers of our class
		int modifier = personClass.getModifiers();
		String modifiers = Modifier.toString(modifier);
		
		System.out.println();
		
		System.out.println("The modifier of our class ---> " + modifiers);
		System.out.println("Is our class private? ---> " + Modifier.isPrivate(modifier));
		System.out.println("Is our class abstract? ---> " + Modifier.isAbstract(modifier));
		System.out.println("Is our class protected? ---> " + Modifier.isProtected(modifier));
		System.out.println("Is our class static? ---> " + Modifier.isStatic(modifier));
		System.out.println("Is our class public? ---> " + Modifier.isPublic(modifier));
		
		System.out.println();
		
		
		//getting the package of our class
		Package packagePersonClass = personClass.getPackage();
		System.out.println("The package of our class ---> " + packagePersonClass);
		
		System.out.println();
		
		
		//getting the superClass of Faculty class
		Class superClass = personClassFaculty.getSuperclass();
		System.out.println("The superclass of the class Faculty ---> " + superClass);
		
		
		//getting the interfaces of our class
		Class[] interfaces = personClass.getInterfaces();
		
		System.out.println();
		
		System.out.print("The interfaces our class implements ---> ");
		for (int i = 0; i < interfaces.length; i++) {
			System.out.print(interfaces[i] + ", ");
		}
		
		System.out.println();
		System.out.println();
		
		
		//getting the constructors of our class
		Constructor<University>[] personUniversityConstructors = personClass.getConstructors();
		System.out.println("The constructors of our class: ");
		for (int i = 0; i < personUniversityConstructors.length; i++) {
			System.out.println(personUniversityConstructors[i]);
		}
		
		System.out.println();
		System.out.println(
				"The number of constructors of the University class ---> " + personUniversityConstructors.length);
		
		
		
		//getting the parameters of the contructor of our class
		Constructor<University> constructor1 = personUniversityConstructors[0];
		Class<?>[] parameterTypes1 = constructor1.getParameterTypes();
		System.out.print("The parameters of our first constructor ---> ");
		for (int i = 0; i < parameterTypes1.length; i++) {
			System.out.print(parameterTypes1[i] + " ");
		}
		
		System.out.println();
		
		Constructor<University> constructor2 = personUniversityConstructors[1];
		Class<?>[] parameterTypes2 = constructor2.getParameterTypes();
		System.out.print("The parameters of our second constructor ---> ");
		for (int i = 0; i < parameterTypes2.length; i++) {
			System.out.print(parameterTypes2[i] + " ");
		}
		
		System.out.println();
		
		Constructor<University> constructor3 = personUniversityConstructors[2];
		Class<?>[] parameterTypes3 = constructor3.getParameterTypes();
		System.out.print("The parameters of our third constructor ---> ");
		for (int i = 0; i < parameterTypes3.length; i++) {
			System.out.print(parameterTypes3[i] + " ");
		}
		
		Constructor<University> newConstructor = personClass.getConstructor(String.class, int.class);
		System.out.println();
		System.out.println();
		
		
		//creating the constructor
		System.out.println("Our object before editing: " + newConstructor);
		University newUniversity = newConstructor.newInstance("KPI", 1898);
		System.out.println("Our object after editing: " + newUniversity);
		System.out.println();

		
		//getting the fields of our class
		Field[] fields = personClass.getFields();
		System.out.println("Public fields of our class: ");
		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i]);
		}
		System.out.println();
		
		
		//getting all the fields of our constructor inclusive private
		Field[] allFields = personClass.getDeclaredFields();
		System.out.println("All the fields of our class: ");
		for (int i = 0; i < allFields.length; i++) {
			System.out.println(allFields[i]);
		}
		System.out.println();
		
		
		//getting the methods of our class
		System.out.println("The methods of our class: ");
		Method[] methods = personClass.getMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i]);
		}

		// MAX

		//changing the fields of our class
		Field nameField = personClass.getField("name");
		nameField.set(newUniversity, "NTUU KPI");
		System.out.println();
		System.out.println("The features of University after changing the field of name ---> " + newUniversity);

		Field yearField = personClass.getField("yearBased");
		nameField.set(newUniversity, "2020");
		System.out.println();
		System.out.println("The features of University after changing the field of yearBasement ---> " + newUniversity);

		Field privatePayment = allFields[0];
		privatePayment.setAccessible(true);
		privatePayment.set(newUniversity, 25000);
		System.out.println("Payment (private value) after changing---> " + privatePayment.get(newUniversity));

		Field auditoryNumber = allFields[1];
		auditoryNumber.setAccessible(true);
		auditoryNumber.set(newUniversity, 90);
		
		System.out.println("auditoryNumber (private value) after changing---> " + auditoryNumber.get(newUniversity));
		System.out.println();
		
		
		//creating and invoking methods
		System.out.println("MyFirst Method: ");
		Method myMethod = personClass.getMethod("printGreeting", String.class, int.class);
		myMethod.invoke(newUniversity, "Hello", 5);
		System.out.println();
		
		System.out.println("MySecond Method: ");
		Method myMethod2 = personClass.getMethod("printCurriculam", String.class);
		myMethod2.invoke(newUniversity, "none");
		System.out.println();
		
		System.out.println("MyThird Method(changed the payment): ");
		Method myMethod3 = personClass.getMethod("setPayment", int.class);
		myMethod3.invoke(newUniversity, 15000);
		System.out.println(newUniversity);

	}

}
