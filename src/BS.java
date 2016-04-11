//U10316053 µ{¬fºú
public class BS {
	int a[];
	BS(){
		a=new int [100];
		makerandom();
	}
	public void makerandom(){//new a 0~99 array
		for(int i=0;i<100;i++){
			a[i]=(int)(Math.random()*100);
			System.out.println(a[i]);
		}
	}
}
