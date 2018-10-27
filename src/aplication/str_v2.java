package aplication;

public class str_v2 {

	public static void main(String[] args) {
		String string="ТокарьТочТив";
		String dString = string.toString().replace('т', 'о');
		String dString1="" ;
		dString1= dString.toString().replace('Т','О');
		System.out.println(dString1);
	}

} } 
