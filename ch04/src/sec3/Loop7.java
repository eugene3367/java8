package sec3;

public class Loop7 {

	public static void main(String[] args) {
		int[][] a={{70,58,98},{98,21,47},{36,78,99},{78,80,90}};
		for(int i=0;i<a.length;i++){
			System.out.println(a[i][0]+"\t"+a[i][1]+"\t"+a[i][2]);
		}
		System.out.println("-------------------------------------");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();			
		}

	}

}
