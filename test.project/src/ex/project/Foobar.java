package ex.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Foobar {
    public String getText() throws IOException {
        loadString("/ex/project/folder/src.txt");
        loadString("folder/src.txt");
        System.out.println("-");

        InputStream in = this.getClass().getResourceAsStream("/ex/project/folder/src.txt");
        InputStreamReader is = new InputStreamReader(in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(is);
        String read = br.readLine();

        while (read != null) {
            System.out.println(read);
            sb.append(read);
            read = br.readLine();
        }

        return sb.toString();
    }

    private void loadString(String rsc) {
        System.out.println("-");
        System.out.println("Loading: " + rsc);
        InputStream in = getClass().getResourceAsStream(rsc);
        System.out.println("loaded: " + in);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("FB: " + (new Foobar()).getText());
    }
}
