package com.neoteric.accountSummary;

public class AccountFile {
    private String fileLocation;
    private String fileName;
    private String fileType;

    public AccountFile(String fileName) {
        this.fileName = fileName;
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileType() {
        return fileType;
    }
}
