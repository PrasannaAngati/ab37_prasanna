package interfaceconcept;

interface country {
	void countrycollection();
}

abstract class state implements country{   //Abstract class
          abstract void state_roads();
          void statecollection()
          {
        	 System.out.println("Print statecollection");
          }

}

public class Interfaceconceptthree extends state{//class

	public static void main(String[] args) {
		Interfaceconceptthree I1=new Interfaceconceptthree();
		I1.countrycollection();
		I1.state_roads();
		I1.statecollection();
	}

	@Override
	void state_roads() {
		// TODO Auto-generated method stub
		 System.out.println("Print state_roads");
	}

	@Override
	public void countrycollection() {
		// TODO Auto-generated method stub
		System.out.println("countrycollection");
	}
	

}
