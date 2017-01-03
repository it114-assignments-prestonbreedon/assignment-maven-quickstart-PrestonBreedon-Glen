package com.mycompany.assignment_maven_quickstart_PrestonBreedon_Glen;


/**
 * Hello world!
 *
 */
public class App 
{
	String name;
	Integer age;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public App(String _name, Integer _age) {
		name = _name;
		age = _age;
	}
	
	public Integer add2age(Integer _add2age) {
		return age + _add2age;
	}

}
