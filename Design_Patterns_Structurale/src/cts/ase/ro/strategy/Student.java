package cts.ase.ro.strategy;

//Obiect
public class Student{

    //-strategie: Strategy
   private SustinereExamen sustinereExamen;

   //+setStrategie(strategie:Strategy):void
    public void setSustinereExamen(SustinereExamen sustinereExamen) {
        this.sustinereExamen = sustinereExamen;
    }

    //+operatie():void
    //public request(){strategie.algoritm();}
    public void sustienereaExamenului(){
        sustinereExamen.tipExamen();
    }



}
