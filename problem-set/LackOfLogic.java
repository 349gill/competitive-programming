// https://www.codechef.com/problems/NOLOGIC

import java.util.*;

class LackOfLogic {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();

		while (sc.hasNextLine()) {
			String s = sc.nextLine().toLowerCase();

			if (s.length() > 0) {
				String answer = "";
				for (int i = 97; i < 122; i++) {
					if (s.indexOf((char) (i)) == -1) {
						answer += String.valueOf((char) (i));
					}
				}
				if (answer.isEmpty()) {
					answer += "~";
				}
				System.out.println(answer);
			}
		}
		sc.close();
	}
}
