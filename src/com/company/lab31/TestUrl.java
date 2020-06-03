package com.company.lab31;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

class TestURL {
    public static void main(String args[]) throws Exception {
        URL google = new URL("http://www.google.com");
        System.out.println("Protocol: " + google.getProtocol());
        System.out.println("Port: " + google.getPort());
        System.out.println("Host: " + google.getHost());
        System.out.println("Ext: " + google.toExternalForm());


        int c;
        URL url = new URL("https://code.jquery.com/jquery-3.3.1.min.js");
        URLConnection urlConn = url.openConnection();
        System.out.println("Date: " + urlConn.getDate());
        System.out.println("Type: " + urlConn.getContentType());
        System.out.println("Exp: " + urlConn.getExpiration());
        System.out.println("Last Modify: " + LocalDateTime
                .ofEpochSecond(urlConn.getLastModified(), 0, ZoneOffset.UTC));
        System.out.println("Length: " + urlConn.getContentLength());
        if (urlConn.getContentLength() > 0) {
            System.out.println("=== Content ===");
            try(InputStream input = urlConn.getInputStream()) {
                int i = urlConn.getContentLength();
                while (((c = input.read()) != -1) && (--i > 0)) {
                    System.out.print((char) c);
                }
            }
        } else {
            System.out.println("No Content Available");
        }

    }
}
