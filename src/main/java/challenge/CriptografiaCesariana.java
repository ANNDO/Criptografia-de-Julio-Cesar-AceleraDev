package challenge;
import java.util.ArrayList;
import java.util.List;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {
        byte cryp_num = 3; // número de casas
        String messsage_lowercase = texto.toLowerCase();// todas letras minúsculas
        String cryp_message = new String();
        if (texto.isEmpty()){
            throw new java.lang.IllegalArgumentException("Texto vazio"); // retorna erro se texto vazio
        }else if(texto == null){
            throw new java.lang.NullPointerException("Texto nulo");// retorna erro se texto nulo

        }else{for (byte idx = 0;idx < texto.length();idx++){
            if (messsage_lowercase.charAt(idx)>=97 && messsage_lowercase.charAt(idx)<=122) {
                int mod = (messsage_lowercase.charAt(idx) + cryp_num - 97) % 26 + 97;//rotaciona o número de casas dentro da tabela ASCII
                cryp_message = cryp_message + (char)mod;// concatena caracteres
            }else{
                cryp_message = cryp_message + messsage_lowercase.charAt(idx);//se não for letra adiciona caracter sem rotacionar
            }
        }}
        return cryp_message;

        //throw new UnsupportedOperationException("esse method nao esta implementado aainda");
    }

    @Override
    public String descriptografar(String texto) {
        byte cryp_num = 3; // número de casas
        String messsage_lowercase = texto.toLowerCase();// todas letras minúsculas
        String decryp_message = new String();
        if (texto.isEmpty()){
            throw new java.lang.IllegalArgumentException("Texto vazio");// retorna erro se texto vazio
        }else if(texto == null){
            throw new java.lang.NullPointerException("Texto nulo");// retorna erro se texto nulo

        }else{
        for (byte idx = 0;idx < texto.length();idx++){
            if (messsage_lowercase.charAt(idx)>=97 && messsage_lowercase.charAt(idx)<=122) {
                int mod = (messsage_lowercase.charAt(idx) - cryp_num - 97) % 26 + 97;//rotaciona o número de casas dentro da tabela ASCII
                decryp_message = decryp_message + (char)mod;// concatena caracteres
            }else{
                decryp_message = decryp_message + messsage_lowercase.charAt(idx);//se não for letras adiciona caracter sem rotacionar
            }
        }
        return decryp_message;
        }


        //throw new UnsupportedOperationException("esse method nao esta implementado aainda");
    }
}
