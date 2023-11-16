/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.unitestsample2.Operations;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Santi
 */
public class OperationsTest {
    
    public OperationsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    @Test
    public void NextNumber_UserNumberGTown_AddedANumber() {
        
        //Arrange, alistamiento de los elementos necesarios
        int userNumber = 10;
        int expectedResult = 11;
        
        //Act, ejecutar el metodo que se esta probando
        int result = Operations.NextNumber(userNumber);
        
        //Assert, comprobar que el resultado obtenido es el esperado
        assertEquals(11, result);
    }
    
    @Test
    public void IsDivisible_TwoIntegerNumbers_IsDivisible() {
        
        //Arrange, alistamiento de los elementos necesarios
        int firstNumber = 5;
        int secondNumber = 5;
        
        
        //Act, ejecutar el metodo que se esta probando
        boolean methodResult = Operations.IsDivisible(firstNumber, secondNumber);
        
        //Assert, comprobar que el resultado obtenido es el esperado
        assertTrue(methodResult);
    }
    
    @Test
    public void IsDivisible_TwoIntegerNumbers_IsNotDivisible() {
        
        //Arrange, alistamiento de los elementos necesarios
        int firstNumber = 5;
        int secondNumber = 6;
        
        
        //Act, ejecutar el metodo que se esta probando
        boolean methodResult = Operations.IsDivisible(firstNumber, secondNumber);
        
        //Assert, comprobar que el resultado obtenido es el esperado
        assertFalse(methodResult);
    }
    
    @Test
    public void RandomNumberDecreased(){
        
        //Arrange
        int randomNum = 30;
        
        //Act
        double randomResult = randomNum - (randomNum*0.15);
        
        //Assert
        assertEquals(25.5, randomResult);
    }
    
    @Test
    public void PercentageBoys(){
        
        //Arrange
        int numBoys = 3;
        int totalGroup = 10;
        
        //Act
        double percentageBoys = (numBoys * 100)/totalGroup;
        
        //Assert
        assertEquals(70.0, percentageBoys);
    }
    
    @Test
    public void PercentageGirls(){
        
        //Arrange
        int numGirls = 7;
        int totalGroup = 10;
        
        //Act
        double percentageGirls = (numGirls * 100)/totalGroup;
        
        //Assert
        assertEquals(70.0, percentageGirls);
    }
}
