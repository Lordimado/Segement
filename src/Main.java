
public class Main {
		public static void main(String [] args){
			Point A=new Point();
			Point B=new Point(5);
			Point C=new Point(3,8);
			Segement AB=new Segement(A,B);
			Segement BC=new Segement(B,C);
			
			System.out.println("* Créer deux segements dans l'espace");
			System.out.println("- Le segement AB ="+AB.distance());
			System.out.println("- le segement BC ="+BC.distance());
			//-----------------------------------------------------------------------------------
			System.out.println("* Créer l'image du segement BC par rapport a l'axe des ordonnée");
			System.out.println("- L'image de BC est CB"+B.imagePoint()+C.imagePoint());
		}
}
