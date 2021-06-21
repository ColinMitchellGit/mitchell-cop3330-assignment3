package ex43;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteReaderTest {

    @Test
    void readSiteName() {
        WebsiteReader read =  new WebsiteReader();
        Scanner input = new Scanner("Youtube");

        assertEquals("Youtube", read.readSiteName(input));
    }

    @Test
    void readAuthor() {
        WebsiteReader read =  new WebsiteReader();
        Scanner input = new Scanner("Mark Zuckerberg");

        assertEquals("Mark Zuckerberg", read.readAuthor(input));
    }

    @Test
    void readJavaScript() {
        WebsiteReader read =  new WebsiteReader();
        Scanner input = new Scanner("Y");
        Character result = new Character('Y');
        assert(result.equals(read.readJavaScript(input)));
    }

    @Test
    void readCSS() {
        WebsiteReader read =  new WebsiteReader();
        Scanner input = new Scanner("N");
        Character result = new Character('N');
        assert(result.equals(read.readJavaScript(input)));
    }
}