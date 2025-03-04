package mathclass;

public class Mathclass {

	public static void main(String[] args) {

		int answer=Math.addExact(10,20);
		System.out.println(answer);
		int answer1=Math.subtractExact(20, 10);
		System.out.println(answer1);
        double answer3=Math.PI;
        System.out.println(answer3);
        Double answer4=Math.random();
        System.out.println(answer4);
        double area=(Math.PI)*Math.pow(Math.random(), 3);
        System.out.println(area);
       
}
}
