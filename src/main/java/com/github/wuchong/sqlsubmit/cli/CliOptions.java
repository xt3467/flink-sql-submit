package com.github.wuchong.sqlsubmit.cli;

/**
 * 客户端操作项
 * 
 * @author spring
 * @date 2019/11/20
 */
public class CliOptions {

    private final String sqlFilePath;
    private final String workingSpace;

    public CliOptions(String sqlFilePath, String workingSpace) {
        this.sqlFilePath = sqlFilePath;
        this.workingSpace = workingSpace;
    }

    public String getSqlFilePath() {
        return sqlFilePath;
    }

    public String getWorkingSpace() {
        return workingSpace;
    }
}
