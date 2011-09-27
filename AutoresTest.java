import static org.junit.Assert.*;
import org.junit.Test;

public class AutoresTest {
	
	@Test
	public void deveFormatarNomeESobrenomeDoAutor(){
		String nomeFormatado = Autores.formata("paulo coelho");
		assertEquals("COELHO, Paulo", nomeFormatado);
	}
	
	@Test
	public void deveFormatarNomeESobrenomeDoAutor2(){
		String nomeFormatado = Autores.formata("joao silva");
		assertEquals("SILVA, Joao", nomeFormatado);
	}
	@Test
	public void deveFormatarNomeESobrenomeDoAutor3(){
		String nomeFormatado = Autores.formata("celso de araujo");
		assertEquals("ARAUJO, Celso de", nomeFormatado);
	}
	
	@Test
	public void deveFormatarNomeESobrenomeDoAutor4(){
		String nomeFormatado = Autores.formata("celso araujo silva");
		assertEquals("SILVA ARAUJO, Celso", nomeFormatado);
	}

}
