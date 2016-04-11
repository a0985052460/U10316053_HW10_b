//U10316053 µ{¬fºú
public class BS {
	int a[];
	BS(){
		a=new int [100];
		makerandom();
		bubble();
	}
	public void makerandom(){//new a 0~99 array
		System.out.println("original arrary");
		for(int i=0;i<100;i++){
			a[i]=(int)(Math.random()*100);
			System.out.print(a[i]+" ");
		}
	}
	public void bubble(){
		for(int k=0;k<100;k++){
			for(int i=0;i<100-k-1;i++){
				if(a[i]>a[i+1]){
					int x=a[i];
					a[i]=a[i+1];
					a[i+1]=x;
				}
			}
		}
		System.out.println("");
		System.out.println("after bubble sort arrary");
		printarrary();
	}
	public void printarrary(){
		for(int i=0;i<100;i++){
			System.out.print(a[i]+" ");
		}
	}
}
