package com.mycompany.assignment_maven_quickstart_PrestonBreedon_Glen;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Basic App test
 */
public class AppTest 
    extends TestCase
{
    /**
     * Extend and create TestCase
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    //Tests the app
    public void testApp()
    {
        assertTrue( true );
    }
}
