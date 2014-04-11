package ex.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Foobar {
    public String getText() throws IOException {
        //        ClassLoader classLoader = Foobar.class.getClassLoader();
        //        System.out.println("ClassLoader:" + classLoader);
        URL myResource = this.getClass().getResource(".");
        System.out.println("MyResource: " + myResource);
        Package package1 = this.getClass().getPackage();
        System.out.println("Package:" + package1);
        loadString("/ex/project/src.txt");
        loadString("src.txt");
        System.out.println("-");

        InputStream in = this.getClass().getResourceAsStream("/ex/project/src.txt");
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
