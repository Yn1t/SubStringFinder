import java.security.KeyPair;
import java.util.List;

public class FindStrings {

    List<Position> findStrings;

    public void writeFindStrings(){
        findStrings.forEach(elem -> {
            System.out.println(elem.before + " before finded string, " + elem.after + " after finded string;\n");
        });
    }
}
