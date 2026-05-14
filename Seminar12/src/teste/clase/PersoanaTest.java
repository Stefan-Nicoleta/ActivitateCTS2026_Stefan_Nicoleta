package teste.clase;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


//testul generat
public class PersoanaTest {

    //setUp va fi apelat inainte de fiecare test (getSex())
    @org.junit.Before
    public void setUp() throws Exception {

    }

    //dupa
    @org.junit.After
    public void tearDown() throws Exception {

    }

    //adaugam test langa getSex()
    @org.junit.Test
    public void testGetSex() {
        Persoana persoana = new Persoana("Matei","1234567890");
        //folosim asertii
        Assert.assertEquals("M",persoana.getSex());
    }

    @org.junit.Test
    public void testGetSexDupa2000() {
        Persoana persoana1 = new Persoana("Nicoleta","6004567890");
        Assert.assertEquals("F", persoana1.getSex());
    }


    @Test
    public void testGetCNP() {
        Persoana persoana = new Persoana("Matei","1751205433611");
        Assert.assertTrue(persoana.checkCNP());
        //sau
        // Assert.assertEquals(true, persoana.checkCNP());
    }



    //BICEP !!! => Boundary, Cross-Check, Error Condition

    //Boundary
    @Test
    public void testBoundaryInferior2000() {
        Persoana persoana = new Persoana("Mircea", "5000101232213");
        //daca punem orice alta valoare in afara de 26, ne da eroare
        Assert.assertEquals(26,persoana.getVarsta());
    }

    @Test
    public void testBoundaryPersoanaAzi() {
        Persoana persoana = new Persoana("Mircea", "5260514232213");
        Assert.assertEquals(0,persoana.getVarsta());
    }


    //Cross-check

    @Test
    public void testCrossCheckGen() {
        String cnp = "6260514232213";
        Persoana persoana = new Persoana("Andreea",cnp);
        String expected ;

        //if chart(i) este string, iar facand %2, avem paritatea codului ASCI
        if(cnp.charAt(0) % 2 == 0){
            expected = "F";
        }
        else{
            expected = "M";
        }

        String actual = persoana.getSex();

        Assert.assertEquals(expected,actual);
    }

    //Error Condition
    //trebuie sa dea eroare cand cnp ul are 13 caractere!
    @Test(expected = IllegalArgumentException.class)
    public void testErrorConditionCheckLungimeCNP() {
        Persoana persoana = new Persoana("Mircea", "526051423221");
        persoana.checkCNP();
    }
}