
public class Autores {

	public static String formata(String nomeAutor) {
		String autor[] = new String[10]; 
		String nomeFormatado = "";
		autor = nomeAutor.split(" ");
		if(autor.length <= 2){
			String nome = autor[0];
			String primeiraLetra = nome.substring(0,1);
			String primeiraLetraMai = primeiraLetra.toUpperCase();
			String nomeCerto = nome.replace(primeiraLetra, primeiraLetraMai);
			String sobrenome = autor[1].toUpperCase();
			 
			nomeFormatado = sobrenome + ", " + nomeCerto;
			
		}else{
			String nome = autor[0];
			String sobreNome2 = autor[1];
			if(sobreNome2.length() > 3 ){
				String primeiraLetra = nome.substring(0,1);
				String primeiraLetraMai = primeiraLetra.toUpperCase();
				String nomeCerto = nome.replace(primeiraLetra, primeiraLetraMai);
				String sobrenome = autor[2].toUpperCase();
				String sobre2 = sobreNome2.toUpperCase();
				
				nomeFormatado = sobrenome + " " + sobre2 + ", " + nomeCerto;
				
				
				
				
			}else{
			String primeiraLetra = nome.substring(0,1);
			String primeiraLetraMai = primeiraLetra.toUpperCase();
			String nomeCerto = nome.replace(primeiraLetra, primeiraLetraMai);
			String sobrenome = autor[2].toUpperCase();
			 
			nomeFormatado = sobrenome + ", " + nomeCerto + " " + sobreNome2;
			}
			
		}
		

		return nomeFormatado;
	}



}
