class Exercise26{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		String ones, tens, hundreds;
		if (a >= 100 && a <= 999) {
			switch (a / 100){
				case 1: hundreds = " Sto"; System.out.print(a + " - " + hundreds); break;
				case 2: hundreds = " Dvesti"; System.out.print(a + " - " + hundreds); break;
				case 3: hundreds = " Tristo"; System.out.print(a + " - " + hundreds); break;
				case 4: hundreds = " 4eturesto"; System.out.print(a + " - " + hundreds); break;
				case 5: hundreds = " Pyat'sot"; System.out.print(a + " - " + hundreds); break;
				case 6: hundreds = " Shest'sot"; System.out.print(a + " - " + hundreds); break;
				case 7: hundreds = " Sem'sot"; System.out.print(a + " - " + hundreds); break;
				case 8: hundreds = " Vosem'sot"; System.out.print(a + " - " + hundreds); break;
				case 9: hundreds = " Devyat'sot"; System.out.print(a + " - " + hundreds); break;
			} if (a % 100 >= 11 && a % 100 <= 19) {
			switch (a % 100) {
				case 11 : System.out.print(" odinadcat'"); break;
				case 12 : System.out.print(" dvenadcat'"); break;
				case 13 : System.out.print(" trinadcat'"); break;
				case 14 : System.out.print(" 4eturnadcat'"); break;
				case 15 : System.out.print(" pyatnadcat'"); break;
				case 16 : System.out.print(" shestnadcat'"); break;
				case 17 : System.out.print(" semnadcat'"); break;
				case 18 : System.out.print(" vosemnadcat'"); break;
				case 19 : System.out.print(" devyatnadcat'"); break;
		    }	} else {
			switch ((a / 10) % 10) {
				case 1: tens = " desyat'"; System.out.print(tens); break;
				case 2: tens = " dvadcat'"; System.out.print(tens); break;
				case 3: tens = " tridcat'"; System.out.print(tens); break;
				case 4: tens = " sorok"; System.out.print(tens); break;
				case 5: tens = " pyat'desyat"; System.out.print(tens); break;
				case 6: tens = " shest'desyat"; System.out.print(tens); break;
				case 7: tens = " sem'desyat"; System.out.print(tens); break;
				case 8: tens = " vosem'desyat"; System.out.print(tens); break;
				case 9: tens = " devyanosto"; System.out.print(tens); break;
			} 
			switch (a % 10) {
				case 1: ones = " odin"; System.out.print(ones); break;
				case 2: ones = " dva"; System.out.print(ones); break;
				case 3: ones = " tri"; System.out.print(ones); break;
				case 4: ones = " 4eturi"; System.out.print(ones); break;
				case 5: ones = " pyat'"; System.out.print(ones); break;
				case 6: ones = " shest'"; System.out.print(ones); break;
				case 7: ones = " sem'"; System.out.print(ones); break;
				case 8: ones = " vosem'"; System.out.print(ones); break;
				case 9: ones = " devyat'"; System.out.print(ones); break;
			}  }
		}
	}
}