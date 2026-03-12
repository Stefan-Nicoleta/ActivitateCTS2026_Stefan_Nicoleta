import ro.ase.cts.eagerinitialization.AgentieEager;
import ro.ase.cts.enuminitialization.AgentieEnum;
import ro.ase.cts.innerstatichelperclass.AgentieInner;
import ro.ase.cts.lazyinitialization.AgentieLazy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AgentieEager a1 = AgentieEager.getInstance("AgeTur", 1000);
        AgentieEager a2 = AgentieEager.getInstance("O alta agentie", 1000);

        System.out.println(a1.getNumeAgentie()); //AgeTur
        System.out.println(a2.getNumeAgentie()); //AgeTur


        //Nu conteaza ce atribute punem in getInstanta, vor ramane aceleasi atribute din getInstanta()


        AgentieLazy l1 = AgentieLazy.getInstanta("A",2); //A
        AgentieLazy l2 = AgentieLazy.getInstanta("B",2); //B

        System.out.println(l1.getNumeAgentie());
        System.out.println(l2.getNumeAgentie());

        AgentieInner ai1 = AgentieInner.getInstance("AAAA",2);
        AgentieInner ai2 = AgentieInner.getInstance("BBBBBBB",10);

        System.out.println(ai1.getNume());
        System.out.println(ai2.getNume());


        AgentieEnum ae1 = AgentieEnum.instanta;
        AgentieEnum ae2 = AgentieEnum.instanta;

        System.out.println(ae1.getNumeAgentie());
        System.out.println(ae2.getNumeAgentie());

        }
    }
