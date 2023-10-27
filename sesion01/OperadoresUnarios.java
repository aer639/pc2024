package org.pc.sesion01;

public class OperadoresUnarios {
	
		public static void main(String[] args) {

			int i = 8;
			int a, b, c;
			System.out.println("\tantes\tdurante\tdespués");
			i = 8;
			a = i;
			b = i++;
			c = i;
			System.out.println("i++\t"+a+'\t'+b+'\t'+c);
			i = 8;
			a = i;
			b = i--;
			c = i;
			System.out.println("i--\t"+a+'\t'+b+'\t'+c);
			i = 8;
			a = i;
			b = ++i;
			c = i;
			System.out.println("++i\t"+a+'\t'+b+'\t'+c);
			i = 8;
			a = i;
			b = --i;
			c = i;
			System.out.println("--i\t"+a+'\t'+b+'\t'+c);
		}

	}



