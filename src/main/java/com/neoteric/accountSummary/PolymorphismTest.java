package com.neoteric.accountSummary;

public class PolymorphismTest {
    public static void main(String[] args) {
        AccountSummaryService pdf = new PdfAccService();
        AccountFile accountFile=pdf.getAccSummary("1234566");
        System.out.println("downloaded file "+accountFile.getFileName());
    }
}
