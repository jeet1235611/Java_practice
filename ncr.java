import java.util.Scanner;

public class MyClass {
public static int NCR(int n, int r) {
	int factN = 1, factNr = 1, factR = 1;
	
	for(int i = 2; i <= n; i++) {
		factN = factN*i;

		if(i <= r) {
			factR = factR*i;
		}
		
		if(i <= (n-r)) {
			factNr = factNr*i;
		}

	}
	int output = factN/(factR*factNr);
	return output;

}
public static void main(String args[]) {
	//System.out.println(NCR(6, 2));
	int output = NCR(6, 2);
	System.out.println(output);
}
}
