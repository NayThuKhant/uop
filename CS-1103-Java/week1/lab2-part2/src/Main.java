import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputStream in = null;
        OutputStream out = null;
        try {
            // Read the URL and file name from the user
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter URL: ");
            String urlString = scan.nextLine();
            System.out.print("Enter file name: ");
            String fileName = scan.nextLine();

            // Create the URL object
            URL url = new URL(urlString);

            // Get the input stream from the URL
            in = url.openStream();

            // Get the output stream for the file
            out = new FileOutputStream(fileName);

            // Copy the data from the web to the file
            copyStream(in, out);

        } catch (MalformedURLException e) {
            System.out.println("Error: Invalid URL");
        } catch (FileNotFoundException e) {
            System.out.println("Error: Could not open file for writing");
        } catch (IOException e) {
            System.out.println("Error: I/O error occurred while reading or writing");
        } finally {
            // Close the streams if they were successfully opened
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                System.out.println("Error: Failed to close stream");
            }
        }
    }


    private static void copyStream(InputStream in, OutputStream out) throws IOException {
        int oneByte = in.read();
        while (oneByte >= 0) { // negative value indicates end-of-stream
            out.write(oneByte);
            oneByte = in.read();
        }
    }
}
