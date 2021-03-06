package weekencap;

public class Trainproblem {
	public void printstatement(Encapsulation[] st) {
		System.out.println("Yasvantpur Delhi Sarai Rohilla AC Duranto Express (12213)");
		System.out.println("-------------------------------------------");
		System.out.println("#  Code   Station           Arr.    Dep.");
		System.out.println("-------------------------------------------");
		for (int i = 0; i < st.length; i++) {
			st[i].printTable(i+1);;
		}
		System.out.println("-------------------------------------------");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation[] sts= {new Encapsulation("YPR", "Yashvantpur Jn", 00.00, 23.40),
				        new Encapsulation("GTL", "Guntakal Jn", 03.45, 03.50), 
				        new Encapsulation("SC", "Secundrabad Jn", 08.55, 09.10), 
				        new Encapsulation("BPQ", "Balharshah", 13.10, 13.35),
				        new Encapsulation("HPJ", "Habibganj", 21.20, 21.25),
				        new Encapsulation("JHS", "Jhansi Jn", 01.15, 01.20),
				        new Encapsulation("DEE", "Delhi S Rohilla", 07.00, 00.00)};
		
		Trainproblem t = new Trainproblem();
		t.printstatement(sts);
	}

	}


