
public class Segement {

		private Point a;
		private Point b;
		
		public Segement(Point a){
			this.a=a;
			this.a=new Point();
		}
		
		public Segement(Point a,Point b){
			this.a=a;
			this.b=b;
		}
		
		public Point getA(){
			return a;
		}
		
		public Point getB(){
			return b;
		}
		
		public void setA(Point a){
			this.a=a;
		}
		
		public void setB(Point b){
			this.b=b;
		}
		
		public double distance(){
			return Math.sqrt(Math.pow(b.getAbcisse()-a.getAbcisse(), 2)+Math.pow(b.getOrdonnee()-a.getOrdonnee(),2));
		}
		
		public Segement imageSegement(){
			return new Segement(this.a.imagePoint(),this.b.imagePoint());
		}
		
		
}
