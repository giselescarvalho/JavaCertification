import com.sun.deploy.net.MessageHeader;

public class Aula06StringBufferEBuilder {

    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Ca");
        sb.append("i cai");  //append adiciona caracteres Buufer pode mudar, diferente da String
        System.out.println(sb.toString());

        StringBuffer sb2 = new StringBuffer(50); //posição inicial da String é 50
        System.out.println(sb2.toString());

        StringBuffer sb3 = new StringBuffer(50);
        sb3.append("balão ");
        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder(sb);
        sb4.append(sb3);
        sb4.append(sb);
        sb4.append(sb3);
        sb4.insert(7, " "); //inserir espaço " " nessa posição
        sb4.insert(14, "; ");
        sb4.insert(23, " ");
        System.out.println(sb4);
        System.out.println("-----------------");
        sb4.delete(3, 22);           //deleta de 3 a 22
        System.out.println(sb4);

        sb4.insert(7, " ");

        System.out.println(sb4);
        System.out.println("-----------------");

        String nome = sb4.toString();
        System.out.println(new StringBuffer("gisele").reverse());

        System.out.println("-----------------");

        System.out.println(sb3.substring(0,3));
        //System.out.println(sb3);//assim retorna a própria String
    }
}
/* O StringBuffer pertence à uma versão mais antiga de Java mas é utilizada até hoje
O StringBuilder também tem a mesma ação, porém só surge a partir de Java5. Não sincroniza o acesso aos métodos
* */