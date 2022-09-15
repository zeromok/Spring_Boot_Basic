package OOP04.ch03;

public class TextBlockTest {
    public static void main(String[] args) {

        String textBlocks = """
                            Hello,
                            Hi,
                            HOW
                            """;

        System.out.println(textBlocks);
        System.out.println(getBlockHTML());
    }

    public static String getBlockHTML() {

        return """
                <html>
                    <body>
                        <p>example Test</p>
                    </body>
                </html>
                """;

    }
}
