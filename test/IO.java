import java.io.*;

class IO {
    public static void main(String[] args) {
        try {
            // Read file as finary file.
            var in = new FileInputStream("file.txt");
            int ch;
            while ((ch = in.read()) != -1) {
                System.out.print(Integer.toHexString(ch) + " ");
            }
            in.close();
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            System.out.println();
        }

        try {
            var is = new FileInputStream("file.txt");
            // Read file as "SJIS" test file.
            var in = new InputStreamReader(is, "SJIS");
            int ch;
            while ((ch = in.read()) != -1) {
                System.out.print(Integer.toHexString(ch) + " ");
            }
            in.close();
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            System.out.println();
        }

        try {
            var in = new FileReader("file.txt");
            int ch;
            while ((ch = in.read()) != -1) {
                System.out.print(Integer.toHexString(ch) + " ");
            }
            in.close();
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            System.out.println();
        }

        try {
            var in = new FileReader("file.txt");
            var br = new BufferedReader(in);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            in.close();
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            System.out.println();
        }
    }
}