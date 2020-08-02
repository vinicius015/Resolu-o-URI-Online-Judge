package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class URI1049 {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		String grupo, subGrupo, alimentacao, animal;
		grupo = scan.next();
		subGrupo = scan.next();
		alimentacao = scan.next();
		animal = "";

		if (grupo.equals("vertebrado")) {

			if (subGrupo.equals("ave")) {

				if (alimentacao.equals("carnivoro")) {
					animal = "aguia";
				} else if (alimentacao.equals("onivoro")) {
					animal = "pomba";
				}
			} else if (subGrupo.equals("mamifero")) {

				if (alimentacao.equals("onivoro")) {
					animal = "homem";
				} else if (alimentacao.equals("herbivoro")) {
					animal = "vaca";
				}
			}

		}

		if (grupo.equals("invertebrado")) {

			if (subGrupo.equals("inseto")) {

				if (alimentacao.equals("hematofago")) {
					animal = "pulga";
				} else if (alimentacao.equals("herbivoro")) {
					animal = "lagarta";
				}
			} else if (subGrupo.equals("anelideo")) {

				if (alimentacao.equals("hematofago")) {
					animal = "sanguessuga";
				} else if (alimentacao.equals("onivoro")) {
					animal = "minhoca";
				}
			}

		}

		System.out.println(animal);

		scan.close();

	}
}
